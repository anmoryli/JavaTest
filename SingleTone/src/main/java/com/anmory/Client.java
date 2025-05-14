package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午3:27
 */

public class Client {
    public static void main(String[] args) {
        // 第一个大臣向皇帝进言
        Minister minister1 = new Minister();
        minister1.setName("张三");
        Emperor emperor1 = Emperor.getInstance();
        System.out.println(minister1.getName() + "向" + emperor1.say() + "进言");
        System.out.println("--------------------------------------------------");

        // 第二个大臣向皇帝进言
        Minister minister2 = new Minister();
        minister2.setName("李四");
        Emperor emperor2 = Emperor.getInstance();
        System.out.println(minister2.getName() + "向" + emperor2.say() + "进言");
        System.out.println("--------------------------------------------------");


        // 第三个大臣向皇帝进言
        Minister minister3 = new Minister();
        minister3.setName("王五");
        Emperor emperor3 = Emperor.getInstance();
        System.out.println(minister3.getName() + "向" + emperor3.say() + "进言");
        System.out.println("--------------------------------------------------");
    }
}
