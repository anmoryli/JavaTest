package com.anmory.mybatistest1.mapper;

import com.anmory.mybatistest1.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    @Test
    void selectAll() {
        List<User> list = userMapper.selectAll();
        System.out.println(list);
    }
}