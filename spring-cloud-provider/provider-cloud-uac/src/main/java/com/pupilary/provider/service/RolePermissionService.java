package com.pupilary.provider.service;

import com.pupilary.provider.model.domain.RolePermission;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pupilary.provider.vo.PermissionVo;

import java.util.List;
import java.util.Set;

/**
 * @author takesi
 * @date 2020-10-26
 */
public interface RolePermissionService extends IService<RolePermission> {

    /**
     * save
     *
     * @param roleId       roleId
     * @param permissionId permissionId
     * @return int
     */
    int save(Long roleId, Long permissionId);

    /**
     * delete
     *
     * @param roleId       roleId
     * @param permissionId permissionId
     * @return int
     */
    int delete(Long roleId, Long permissionId);

    /**
     * loadPermissionByRoleIds
     *
     * @param roleIds roleIds
     * @return List
     */
    List<PermissionVo> loadPermissionByRoleIds(Set<Long> roleIds);

    /**
     * loadPermissionByroleCodes
     *
     * @param roleCodes roleCodes
     * @return List
     */
    List<PermissionVo> loadPermissionByRoleCodes(Set<String> roleCodes);
}
