package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午7:34
 */

public class WorkexperienceResume extends Decorator{
    public WorkexperienceResume(Resume resume,String workexperience) {
        super(resume);
        this.workexperience = workexperience;
    }
    private String workexperience;

    @Override
    String getName() {
        return getResume().getName();
    }

    @Override
    String getDescription() {
        return getResume().getDescription() + "Workexperience:" + workexperience;
    }
}
