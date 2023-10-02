package ru.tinkoff.structure.bridge.policy;

import ru.tinkoff.structure.bridge.sender.SenderInterface;

public class KSKPolicy extends Policy{
    public KSKPolicy(SenderInterface sender) {
        super(sender);
    }

    public void sendPolicy() {
        super.sendPolicy("KSKPolicy");
    }
}
