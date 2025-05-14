package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午7:36
 */

public class Client {
    public static void main(String[] args) {
        // 简历1：仅设置名字
        Resume resume1 = new BasicResume("张三");
        System.out.println(resume1.getDescription());

        // 简历2：设置名字和性别
        Resume resume2 = new SexResume(new BasicResume("李四"),"男");
        System.out.println(resume2.getDescription());

        // 简历3：设置名字、性别和工作经历
        Resume resume3 = new WorkexperienceResume(new SexResume(new BasicResume("王五"),"男"),"2015-2016");
        System.out.println(resume3.getDescription());
    }
}
