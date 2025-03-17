package com.anmory.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-18 上午6:23
 */

//@RestController
//@RequestMapping("/user")
//public class UserController {
//    @RequestMapping("/v1")
//    public String addUser() {
//        return "添加了一个用户";
//    }
//}

@RestController
@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {
    @GetMapping("/v1")
    public String addUser() {
        return "添加了一个用户";
    }
}
