package ru.tinkoff.behavior.chainresponsibility.policy.component;

public interface ComponentInterface {

    public void setNext(ComponentInterface component);
    public void handle(String info);
    public void handleNextIfNeeded(String info);
}
