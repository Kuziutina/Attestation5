package ru.tinkoff.behavior.observer.core;

public class SMSSender {
    public void send(String policy) {
        System.out.println("Send sms for admin about policy " + policy);
    }
}
