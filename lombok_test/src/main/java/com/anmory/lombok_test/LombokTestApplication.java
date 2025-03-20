package com.anmory.lombok_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LombokTestApplication.class, args);
        Person person = new Person();
        person.setName("anmory");
        person.setCity("chengdu");
        System.out.println(person);
    }

}
