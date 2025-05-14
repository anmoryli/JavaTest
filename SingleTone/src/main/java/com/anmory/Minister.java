package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午3:25
 */

public class Minister {
    public Minister() {
        System.out.println("创建一个大臣");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Minister{" +
                "name='" + name + '\'' +
                '}';
    }
}
