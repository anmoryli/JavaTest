package com.anmory.sqlservertest.controller;

import com.anmory.sqlservertest.model.User;
import com.anmory.sqlservertest.model.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-13 上午11:41
 */

@RestController
public class UserController {
    @Resource
    UserMapper userMapper;
    @RequestMapping("/getUserById")
    @ResponseBody
    public Object getUserById(Integer id) {
        User user = new User();
        user.setAge(id);
        return userMapper.getUserById(user.getAge());
    }
}
