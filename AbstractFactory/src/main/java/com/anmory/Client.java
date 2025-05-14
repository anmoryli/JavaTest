package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午4:17
 */

public class Client {
    public static void main(String[] args) {
        ComponentFactory factory = new LinuxFactory();
        factory.createButton().click();
        factory.createTextInput().render();

        factory = new WindowsFactory();
        factory.createButton().click();
        factory.createTextInput().render();
    }
}
