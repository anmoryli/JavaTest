package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午4:17
 */

public class LinuxFactory extends ComponentFactory{
    @Override
    public TextInput createTextInput() {
        System.out.println("Linux工厂生产输入框");
        return new LinuxTextInput();
    }

    @Override
    public Button createButton() {
        System.out.println("Linux工厂生产按钮");
        return new LinuxButton();
    }
}
