package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.core.security.oauth2.domain.OauthUser;
import com.pupilary.provider.mapper.UserMapper;
import com.pupilary.provider.model.domain.Role;
import com.pupilary.provider.model.domain.User;
import com.pupilary.provider.service.RolePermissionService;
import com.pupilary.provider.service.RoleService;
import com.pupilary.provider.service.UserService;
import com.pupilary.provider.vo.PermissionVo;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author takesi
 * @date 2020-10-14
 */
@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private final UserMapper userMapper;
    private final RoleService roleService;
    private final RolePermissionService rolePermissionService;

    @Override
    public OauthUser getByUsername(String username) {
        User user = userMapper.selectByUsername(username);
        return this.getOauthUser(user);
    }

    @Override
    public OauthUser getOauthUser(User user) {
        if (!Objects.isNull(user)) {
            OauthUser oauthUser = new OauthUser();
            BeanUtils.copyProperties(user, oauthUser);

            List<Role> roleList = roleService.getRoleByUserId(user.getId());
            oauthUser.setRoles(roleList);

            if (!CollectionUtils.isEmpty(roleList)) {
                Set<Long> roleIds = roleList.parallelStream()
                        .map(Role::getId)
                        .collect(Collectors.toSet());
                List<PermissionVo> permissionList = rolePermissionService.loadPermissionByRoleIds(roleIds);

                if (!CollectionUtils.isEmpty(permissionList)) {
                    Set<String> permissions = permissionList.parallelStream()
                            .map(PermissionVo::getUrl)
                            .collect(Collectors.toSet());
                    oauthUser.setPermissions(permissions);
                }
            }
            return oauthUser;
        }
        return null;
    }
}
