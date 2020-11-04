package com.pupilary.provider.service.impl;

import com.pupilary.provider.vo.PermissionVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.provider.mapper.RolePermissionMapper;
import com.pupilary.provider.model.domain.RolePermission;
import com.pupilary.provider.service.RolePermissionService;

import java.util.List;
import java.util.Set;

/**
 * @author takesi
 * @date 2020-10-26
 */
@Service
@AllArgsConstructor
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService {

    private final RolePermissionMapper rolePermissionMapper;

    @Override
    public int save(Long roleId, Long permissionId) {
        return rolePermissionMapper.addRolePermission(roleId, permissionId);
    }

    @Override
    public int delete(Long roleId, Long permissionId) {
        return rolePermissionMapper.deleteRolePermissionByRoleIdAndPermissionId(roleId, permissionId);
    }

    @Override
    public List<PermissionVo> loadPermissionByRoleIds(Set<Long> roleIds) {
        return rolePermissionMapper.findPermissionByRoleIds(roleIds);
    }

    @Override
    public List<PermissionVo> loadPermissionByRoleCodes(Set<String> roleCodes) {
        return rolePermissionMapper.findPermissionByRoleCodes(roleCodes);
    }
}
