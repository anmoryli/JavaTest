package com.anmory.ioc;

import com.anmory.ioc.controller.HelloController;
import com.anmory.ioc.controller.UserController;
import com.anmory.ioc.dao.UserDao;
import com.anmory.ioc.service.UserService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IoCApplication {

    public static void main(String[] args) {SpringApplication.run(IoCApplication.class, args);
        UserController userController = new UserController(new UserService(new UserDao()));
        userController.userController();
    }

}
