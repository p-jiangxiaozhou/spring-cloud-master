package com.pupilary.provider.service;

import com.pupilary.provider.model.domain.Permission;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pupilary.provider.vo.PermissionVo;

import java.util.List;
import java.util.Set;

/**
 * @author takesi
 * @date 2020-10-26
 */
public interface PermissionService extends IService<Permission> {

    /**
     * 查询所有权限信息
     *
     * @return List
     */
    List<PermissionVo> all();

    /**
     * 查询所有一级权限
     *
     * @return List
     */
    List<PermissionVo> levelOnes();

    /**
     * 角色分配权限
     *
     * @param permissionIds permissionIds
     * @param roleId        roleId
     */
    void setPermissionToRole(Set<Long> permissionIds, Long roleId);

    /**
     * 角色菜单列表
     *
     * @param roleIds roleIds
     * @return List
     */
    List<PermissionVo> loadByRoleIds(Set<Long> roleIds);

    /**
     * 角色菜单列表
     *
     * @param roleCodes roleCodes
     * @return List
     */
    List<PermissionVo> loadByRoleCodes(Set<String> roleCodes);

}
