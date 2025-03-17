package com.anmory.sqlservertest.model;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-13 上午11:37
 */

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
