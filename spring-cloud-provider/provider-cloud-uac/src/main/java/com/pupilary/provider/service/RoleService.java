package com.pupilary.provider.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pupilary.provider.model.domain.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pupilary.provider.query.RoleQuery;
import com.pupilary.provider.vo.RoleVo;

import java.util.List;

/**
 * @author takesi
 * @date 2020-10-16
 */
public interface RoleService extends IService<Role> {

    /**
     * getRileByUserId
     *
     * @param userId userId
     * @return List
     */
    List<Role> getRoleByUserId(Long userId);

    /**
     * getRoles
     *
     * @param roleQuery roleQuery
     * @return Page
     */
    IPage<RoleVo> getRoles(RoleQuery roleQuery);
}
