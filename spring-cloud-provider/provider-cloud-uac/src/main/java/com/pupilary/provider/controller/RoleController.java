package com.pupilary.provider.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pupilary.base.wrapper.PageWrapMapper;
import com.pupilary.base.wrapper.PageWrapper;
import com.pupilary.base.wrapper.WrapMapper;
import com.pupilary.base.wrapper.Wrapper;
import com.pupilary.core.base.BaseController;
import com.pupilary.provider.query.RoleQuery;
import com.pupilary.provider.service.PermissionService;
import com.pupilary.provider.service.RoleService;
import com.pupilary.provider.vo.PermissionVo;
import com.pupilary.provider.vo.RoleVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 角色模块api
 *
 * @author takesi
 * @date 2020-10-17
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/role")
public class RoleController extends BaseController {

    private final RoleService roleService;
    private final PermissionService permissionService;

    @GetMapping(value = "/list")
    public PageWrapper<List<RoleVo>> findRoles(RoleQuery roleQuery) {
        IPage<RoleVo> result = roleService.getRoles(roleQuery);
        return PageWrapMapper.wrap(result.getRecords(), result.getCurrent(), result.getSize(), result.getTotal());
    }

    /**
     * 根据roleId获取对应的菜单
     *
     * @param roleId roleId
     * @return List
     */
    @GetMapping(value = "/{roleId}/permissions")
    public Wrapper<List<PermissionVo>> findPermissionsByRoleId(@PathVariable Long roleId) {
        Set<Long> roleIds = new HashSet<>();
        List<PermissionVo> result = permissionService.loadByRoleIds(roleIds);
        return WrapMapper.ok(result);
    }

}
