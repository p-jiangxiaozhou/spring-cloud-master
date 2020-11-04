package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.core.constant.CommonConstants;
import com.pupilary.core.utils.BeanUtils;
import com.pupilary.provider.mapper.PermissionMapper;
import com.pupilary.provider.model.domain.Permission;
import com.pupilary.provider.model.domain.RolePermission;
import com.pupilary.provider.service.PermissionService;
import com.pupilary.provider.service.RolePermissionService;
import com.pupilary.provider.vo.PermissionVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author takesi
 * @date 2020-10-26
 */
@Service
@AllArgsConstructor
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

    private final RolePermissionService rolePermissionService;

    @Override
    public List<PermissionVo> all() {
        List<Permission> permissionList = baseMapper.selectList(
                new QueryWrapper<Permission>().orderByAsc(Permission.COL_SORT)
        );
        return permissionList.stream().map(item -> {
            PermissionVo permissionVo = new PermissionVo();
            BeanUtils.copyProperties(item, permissionVo);
            return permissionVo;
        }).collect(Collectors.toList());
    }

    @Override
    public List<PermissionVo> levelOnes() {
        List<Permission> permissionList = baseMapper.selectList(
                new QueryWrapper<Permission>()
                        .eq(Permission.COL_PARENT_ID, CommonConstants.ROOT_LEVEL)
                        .orderByAsc(Permission.COL_SORT)
        );
        return permissionList.stream().map(item -> {
            PermissionVo permissionVo = new PermissionVo();
            BeanUtils.copyProperties(item, permissionVo);
            return permissionVo;
        }).collect(Collectors.toList());
    }

    @Override
    public void setPermissionToRole(Set<Long> permissionIds, Long roleId) {
        rolePermissionService.delete(roleId, null);

        if (!CollectionUtils.isEmpty(permissionIds)) {
            List<RolePermission> rolePermissions = permissionIds.stream().map(item -> {
                RolePermission rolePermission = new RolePermission();
                rolePermission.setRoleId(roleId);
                rolePermission.setPermissionId(item);
                return rolePermission;
            }).collect(Collectors.toList());

            rolePermissionService.saveBatch(rolePermissions);
        }
    }

    @Override
    public List<PermissionVo> loadByRoleIds(Set<Long> roleIds) {
        return rolePermissionService.loadPermissionByRoleIds(roleIds);
    }

    @Override
    public List<PermissionVo> loadByRoleCodes(Set<String> roleCodes) {
        return rolePermissionService.loadPermissionByRoleCodes(roleCodes);
    }
}
