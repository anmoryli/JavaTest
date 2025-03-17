package com.anmory.ioc.controller;

import com.anmory.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 下午6:03
 */

@Component
public class UserController {
    @Autowired
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void userController() {
        userService.userService();
    }
}