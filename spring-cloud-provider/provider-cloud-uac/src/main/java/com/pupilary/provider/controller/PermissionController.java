package com.pupilary.provider.controller;

import com.pupilary.core.base.BaseController;
import com.pupilary.provider.service.PermissionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author takesi
 * @date 2020-10-31
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/permission")
public class PermissionController extends BaseController {

    private final PermissionService permissionService;

}
