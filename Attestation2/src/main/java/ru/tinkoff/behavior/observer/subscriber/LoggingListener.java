package ru.tinkoff.behavior.observer.subscriber;

public class LoggingListener implements Subscriber{

    @Override
    public void doLogic(String policy) {
        System.out.println("logging " + policy);
    }
}
