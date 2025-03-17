package com.anmory.http;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-21 上午4:12
 */

//@RestController
@Controller
public class Http {
    @RequestMapping("/getHeader")
    public String getHeader(HttpServletRequest request) {
        String userAgent = request.getHeader("User-Agent");
        return "User-Agent: " + userAgent;
    }

    @RequestMapping("/getHeader2")
    public String getHeader(@RequestHeader("User-Agent") String userAgent) {
        return "User-Agent: " + userAgent;
    }

    @RequestMapping("/r1")
    public String returnPage() {
        return "index.html";
    }

    @ResponseBody
    @RequestMapping("/r2")
    public String returnPage2() {
        return "data";
    }

    @ResponseBody
    @RequestMapping("/r3")
    public String returnPage3() {
        return "<h1>Anmory</h1>";
    }

    @ResponseBody
    @RequestMapping(value = "/r4", produces = "text/plain")
    public String returnPage4() {
        return "<h1>Anmory</h1>";
    }

    @ResponseBody
    @RequestMapping(value = "/r5", produces = "application/json")
    public String returnJson() {
        return "name:anmory,age:19";
    }

    @ResponseBody
    @RequestMapping("setStatus")
    public String setStatus(HttpServletResponse response) {
        response.setStatus(401);
        return "设置状态码成功";
    }
}
