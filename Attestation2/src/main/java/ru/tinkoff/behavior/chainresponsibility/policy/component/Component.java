package ru.tinkoff.behavior.chainresponsibility.policy.component;

abstract public class Component implements ComponentInterface{

    protected ComponentInterface next;

    @Override
    public void setNext(ComponentInterface component) {
        next = component;
    }

    @Override
    public void handleNextIfNeeded(String info) {
        if (next != null) {
            next.handle(info);
        }
    }
}
