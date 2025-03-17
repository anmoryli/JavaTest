package com.anmory.bookmanage.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-22 上午6:14
 */

@RequestMapping("/user")
@RestController
public class UserController {
    @RequestMapping("/login")
    public boolean login(String username, String password, HttpSession session) {
        if(!StringUtils.hasLength(username) && !StringUtils.hasLength(password)) {
            return false;
        }
        if("anmory".equals(username) && "lmjnb666".equals(password)) {
            session.setAttribute("username", username);
            return true;
        }
        return false;
    }
}
