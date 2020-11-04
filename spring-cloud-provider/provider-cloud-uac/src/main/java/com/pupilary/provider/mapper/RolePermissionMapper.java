package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.RolePermission;
import com.pupilary.provider.vo.PermissionVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * @author takesi
 * @date 2020-10-26
 */
@Mapper
public interface RolePermissionMapper extends BaseMapper<RolePermission> {

    /**
     * addRolePermission
     *
     * @param roleId       roleId
     * @param permissionId permissionId
     * @return int
     */
    @Insert("insert into uac_role_permission(role_id, permission_id) values (#{roleId}, #{permissionId})")
    int addRolePermission(@Param("roleId") Long roleId, @Param("permissionId") Long permissionId);

    /**
     * deleteRolePermission
     *
     * @param roleId       roleId
     * @param permissionId permissionId
     * @return int
     */
    int deleteRolePermissionByRoleIdAndPermissionId(@Param("roleId") Long roleId, @Param("permissionId") Long permissionId);

    /**
     * findPermissionByRoleIds
     *
     * @param roleIds roleIds
     * @return List
     */
    List<PermissionVo> findPermissionByRoleIds(@Param("roleIds") Set<Long> roleIds);

    /**
     * findPermissionByRoleCodes
     *
     * @param roleCodes roleCodes
     * @return List
     */
    List<PermissionVo> findPermissionByRoleCodes(@Param("roleCodes") Set<String> roleCodes);
}
