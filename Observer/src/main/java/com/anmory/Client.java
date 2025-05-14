package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-13 下午11:22
 */

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver("Anmory", subject);
        subject.attach(observer);
        ((ConcreteSubject)subject).setSubjectState("1");
        subject.notifyObservers();
    }
}
