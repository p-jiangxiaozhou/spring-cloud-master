package com.pupilary.provider.controller;

import com.pupilary.base.wrapper.WrapMapper;
import com.pupilary.base.wrapper.Wrapper;
import com.pupilary.core.base.BaseController;
import com.pupilary.provider.service.RoleService;
import com.pupilary.vo.RoleVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author takesi
 * @date 2020-10-20
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/role")
public class RoleController extends BaseController {

    private final RoleService roleService;

    @GetMapping(value = "/{id}")
    public Wrapper<RoleVo> role(@PathVariable("id") Long id) {

        return WrapMapper.ok();
    }

}
