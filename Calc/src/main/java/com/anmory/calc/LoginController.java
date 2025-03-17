package com.anmory.calc;

import ch.qos.logback.core.util.StringUtil;
import jakarta.servlet.http.HttpSession;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-21 上午8:22
 */

@RequestMapping("/user")
@RestController
public class LoginController {
    @RequestMapping("/login")
    public Boolean login(String username, String password, HttpSession session) {
//        if(username == null || password == null || username.isEmpty() || password.isEmpty()) return false;
        if(!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return false;
        }
        if("anmory".equals(username) && "lmjnb666".equals(password)) {
            session.setAttribute("username", username);
            return true;
        }
        return false;
    }

    @RequestMapping("/getUsername")
    public String getUsername(HttpSession session) {
        String username = (String)session.getAttribute("username");
        return "登录的用户为: " + username;
    }
}