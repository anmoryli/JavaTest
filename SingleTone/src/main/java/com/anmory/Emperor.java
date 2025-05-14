package com.anmory;

import lombok.Data;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午3:17
 */

public class Emperor  {
    private static Emperor emperor = null;
    private Emperor() {
        System.out.println("创建一个皇帝");
    }

    public static Emperor getInstance() {
        if (emperor == null) {
            emperor = new Emperor();
            System.out.println("第一次创建皇帝");
        }
        else {
            System.out.println("已经创建过皇帝了");
        }
        return emperor;
    }

    public String say() {
        return "嘉靖皇帝";
    }
}
