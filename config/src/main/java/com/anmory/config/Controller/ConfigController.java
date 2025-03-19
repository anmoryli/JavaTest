package com.anmory.config.Controller;

import com.anmory.config.Model.Person;
import com.anmory.config.Model.DbTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-17 下午7:12
 */

@RestController
public class ConfigController {
    @Value("${my.key1}")
    String mykey1;

    @Value("${my.key2}")
    Integer mykey2;

    @Autowired
    Person person;
    @Autowired
    DbTypes dbTypes;
    @RequestMapping("/config")
    public void config() {
        System.out.println("mykey1:" + mykey1);
        System.out.println("mykey2:" + mykey2);
        System.out.println("person: " + person);
        System.out.println("dbTypes: " + dbTypes);
    }
}
