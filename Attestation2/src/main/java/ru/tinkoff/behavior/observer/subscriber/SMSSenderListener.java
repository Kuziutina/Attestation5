package ru.tinkoff.behavior.observer.subscriber;

import ru.tinkoff.behavior.observer.core.SMSSender;

public class SMSSenderListener implements Subscriber{
    private SMSSender smsSender;

    public SMSSenderListener() {
        this.smsSender = new SMSSender();
    }

    @Override
    public void doLogic(String policy) {
        smsSender.send(policy);
    }
}
