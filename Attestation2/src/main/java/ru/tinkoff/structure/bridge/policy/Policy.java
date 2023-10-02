package ru.tinkoff.structure.bridge.policy;

import ru.tinkoff.structure.bridge.sender.SenderInterface;

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
