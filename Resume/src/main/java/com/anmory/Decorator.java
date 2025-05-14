package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-12 下午7:29
 */

public abstract class Decorator extends Resume {
    private Resume resume;

    public Decorator(Resume resume) {
        this.resume = resume;
    }

    public Resume getResume() {
        return resume;
    }
}
