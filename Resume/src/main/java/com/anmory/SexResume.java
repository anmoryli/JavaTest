package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午7:30
 */

public class SexResume extends Decorator{
    public SexResume(Resume resume,String sex) {
        super(resume);
        this.sex = sex;
    }

    private String sex;
    @Override
    String getName() {
        return getResume().getName();
    }

    @Override
    String getDescription() {
        return getResume().getDescription() + "Gender:" + sex;
    }
}
