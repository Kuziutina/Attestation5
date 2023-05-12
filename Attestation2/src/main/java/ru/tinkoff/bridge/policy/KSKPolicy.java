package ru.tinkoff.bridge.policy;

import ru.tinkoff.bridge.sender.SenderInterface;

public class KSKPolicy extends Policy{
    public KSKPolicy(SenderInterface sender) {
        super(sender);
    }

    public void sendPolicy() {
        super.sendPolicy("KSKPolicy");
    }
}
