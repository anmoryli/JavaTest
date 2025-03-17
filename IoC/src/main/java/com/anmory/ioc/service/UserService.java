package com.anmory.ioc.service;

import com.anmory.ioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 下午6:01
 */

@Service
public class UserService {
    UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired

    public void userService() {
        userDao.userDao();
    }
}
