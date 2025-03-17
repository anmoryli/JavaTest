package com.anmory.springweb;

import java.util.Scanner;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-20 下午7:22
 */

public class DeepSeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的问题:");
        String s = sc.next();
        System.out.println("正在思考中...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("服务器繁忙，请稍后再试");
    }
}
