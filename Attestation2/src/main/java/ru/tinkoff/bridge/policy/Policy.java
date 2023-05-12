package ru.tinkoff.bridge.policy;

import ru.tinkoff.bridge.sender.SenderInterface;

public abstract class Policy {
    SenderInterface sender;

    public Policy(SenderInterface sender) {
        this.sender = sender;
    }

    public void sendPolicy(String document) {
        sender.sendPolicy(document);
    }

    public void sendPolicy() {
        throw new UnsupportedOperationException();
    }
}
