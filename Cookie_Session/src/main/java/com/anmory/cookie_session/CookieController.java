package com.anmory.cookie_session;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-21 上午1:25
 */


// 传统方式获取cookie
@RestController
@RequestMapping("/cookie")
public class CookieController {
    @RequestMapping("/t1")
    public String cookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for(Cookie c : cookies) {
                System.out.println(c.getName() + ":" + c.getValue());
            }
        }
        return "返回cookie成功";
    }

    // 注解方式获取cookie
    @RequestMapping("/t2")
    public String cookie2(@CookieValue("name") String name) {
        return "返回cookie成功 : " + name;
    }

    // 存储session
    @RequestMapping("/set_session")
    public String setSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("name", "anmory");
        session.setAttribute("age", 19);
        return "session存储成功";
    }

    // 获得session方式1
    @RequestMapping("/get_session")
    public String getSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if(session == null) return "用户未登录";
        else {
            // 从session中获取用户名称信息
            String name = (String)session.getAttribute("name");
            Integer age = (Integer)session.getAttribute("age");
            return "登录的用户为: " + name +
                    "用户年龄为: " + age;
        }
    }

    // 获得session方式2
    @RequestMapping("/get_session2")
    public String getSession2(HttpSession session) {
            // 从session中获取用户名称信息
            String name = (String)session.getAttribute("name");
            Integer age = (Integer)session.getAttribute("age");
            return "登录的用户为: " + name +
                    "用户年龄为: " + age;
    }

    // 获得session方式3
    @RequestMapping("/get_session3")
    public String getSession3(@SessionAttribute("name") String name,@SessionAttribute("age") Integer age) {
        return "登录的用户为: " + name +
                "用户年龄为: " + age;
    }

}
