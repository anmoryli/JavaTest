package com.anmory.bookmanage;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class BookManageApplication {

    public static void main(String[] args) {SpringApplication.run(BookManageApplication.class, args);}

}
