package com.pupilary.provider.service;

import com.pupilary.provider.model.domain.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pupilary.provider.vo.RoleVo;

import java.util.List;
import java.util.Set;

/**
 * @author takesi
 * @date 2020-10-26
 */
public interface UserRoleService extends IService<UserRole> {

    /**
     * deleteByUserIdAndRoleId
     *
     * @param userId userId
     * @param roleId roleId
     * @return int
     */
    int deleteByUserIdAndRoleId(Long userId, Long roleId);

    /**
     * saveUserRole
     *
     * @param userId userId
     * @param roleId roleId
     * @return int
     */
    int saveUserRole(Long userId, Long roleId);

    /**
     * findRolesByUserId
     *
     * @param userId userId
     * @return List
     */
    List<RoleVo> findRolesByUserId(Long userId);

    /**
     * findRolesByUserIds
     *
     * @param userIds userIds
     * @return List
     */
    List<RoleVo> findRolesByUserIds(Set<Long> userIds);

}
