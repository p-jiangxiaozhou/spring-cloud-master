package com.pupilary.provider.service.impl;

import com.pupilary.provider.vo.RoleVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.provider.model.domain.UserRole;
import com.pupilary.provider.mapper.UserRoleMapper;
import com.pupilary.provider.service.UserRoleService;

import java.util.List;
import java.util.Set;

/**
 * @author takesi
 * @date 2020-10-26
 */
@Service
@AllArgsConstructor
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

    private final UserRoleMapper userRoleMapper;

    @Override
    public int deleteByUserIdAndRoleId(Long userId, Long roleId) {
        return userRoleMapper.deleteUserRoleByUserIdAndRoleId(userId, roleId);
    }

    @Override
    public int saveUserRole(Long userId, Long roleId) {
        return userRoleMapper.addUserRole(userId, roleId);
    }

    @Override
    public List<RoleVo> findRolesByUserId(Long userId) {
        return userRoleMapper.findRoleByUserId(userId);
    }

    @Override
    public List<RoleVo> findRolesByUserIds(Set<Long> userIds) {
        return userRoleMapper.findRoleByUserIds(userIds);
    }


}
