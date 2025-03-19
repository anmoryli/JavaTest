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

    @Test
    void selectByName() {
        System.out.println(userMapper.selectByName("anmory"));
    }

    @Test
    void insertUser() {
        int i = userMapper.insertUser("test","test");
        System.out.println("影响行数:" + i);
    }

    @Test
    void insertUser2() {
        User user = new User();
        user.setUsername("getId");
        user.setPassword("getId");
        int i = userMapper.insertUser2(user);
        int id = user.getId();
        System.out.println("影响了" + i + "行," + "id为:" + id);
    }


    @Test
    void deleteUser() {
        User user1 = new User();
        user1.setId(4);
        userMapper.deleteUser(user1);
    }

    @Test
    void updateUser() {
        User user2 = new User();
        user2.setId(1);
        user2.setUsername("huanhuan");
        user2.setPassword("lovehuanhuan");
        userMapper.updateUser(user2);
    }

    @Test
    void selectAllXml() {
        System.out.println(userMapper.selectAllXml());
    }

    @Test
    void insertXml() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("test");
        Integer i = userMapper.insertXml(user);
        System.out.println(i);
        int id = user.getId();
        System.out.println(id);
    }

    @Test
    void deleteXml() {
        User user = new User();
        user.setId(5);
        userMapper.deleteXml(user);
    }
}