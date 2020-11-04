package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.UserRole;
import com.pupilary.provider.vo.RoleVo;
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
public interface UserRoleMapper extends BaseMapper<UserRole> {

    /**
     * addUserRole
     *
     * @param userId userId
     * @param roleId roleId
     * @return int
     */
    @Insert("insert into uac_user_role(user_id, role_id) values (#{userId}, #{roleId})")
    int addUserRole(@Param("userId") Long userId, @Param("roleId") Long roleId);

    /**
     * deleteUserRoleByUserIdAndRoleId
     *
     * @param userId userId
     * @param roleId roleId
     * @return int
     */
    int deleteUserRoleByUserIdAndRoleId(@Param("userId") Long userId, @Param("roleId") Long roleId);

    /**
     * findRoleByUserId
     *
     * @param userId userId
     * @return List
     */
    List<RoleVo> findRoleByUserId(@Param("userId") Long userId);

    /**
     * findRoleByUserIds
     *
     * @param userIds userIds
     * @return List
     */
    List<RoleVo> findRoleByUserIds(@Param("userIds") Set<Long> userIds);

}
