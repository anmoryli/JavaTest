package com.anmory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-13 下午11:15
 */

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public List<Observer> getObservers() {
        return observers;
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
}
