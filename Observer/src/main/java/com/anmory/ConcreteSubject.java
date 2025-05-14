package com.anmory;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-13 下午11:20
 */

public class ConcreteSubject extends Subject{
    private String subjectState;
    public String getSubjectState() {
        return subjectState;
    }
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
    @Override
    public void attach(Observer observer) {
        super.getObservers().add(observer);
    }
    @Override
    public void detach(Observer observer) {
        super.getObservers().remove(observer);
    }
}
