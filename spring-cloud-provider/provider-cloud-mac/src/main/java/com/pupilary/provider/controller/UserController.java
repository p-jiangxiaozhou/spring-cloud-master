package com.pupilary.provider.controller;

import com.pupilary.core.base.BaseController;
import com.pupilary.provider.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author takesi
 * @date 2020-10-18
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    private final UserService userService;

    @GetMapping(value = "/current_user")
    public String userInfo(Principal principal) {
        return principal.getName();
    }

}
