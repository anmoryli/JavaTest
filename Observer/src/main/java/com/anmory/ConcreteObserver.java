package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-13 下午11:19
 */

public class ConcreteObserver extends Observer{
    private String name;
    private String observerState;
    private Subject subject;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = ((ConcreteSubject)subject).getSubjectState();
        System.out.println("观察者" + name + "的新状态是：" + observerState);
    }
}
