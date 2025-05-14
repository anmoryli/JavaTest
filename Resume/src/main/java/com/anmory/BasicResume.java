package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午7:27
 */

public class BasicResume extends Resume{
    String name;
    public BasicResume(String name) {
        this.name = name;
    }
    @Override
    String getName() {
        return name;
    }

    @Override
    String getDescription() {
        return "Name:" + name;
    }
}
