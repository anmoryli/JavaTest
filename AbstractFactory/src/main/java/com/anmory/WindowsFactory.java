package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午4:13
 */

public class WindowsFactory extends ComponentFactory{
    @Override
    public WindowsTextInput createTextInput() {
        System.out.println("Windows工厂生产输入框");
        return new WindowsTextInput();
    }

    @Override
    public WindowsButton createButton() {
        System.out.println("Windows工厂生产按钮");
        return new WindowsButton();
    }
}
