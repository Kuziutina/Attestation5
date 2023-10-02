package ru.tinkoff.structure.bridge.policy;

import ru.tinkoff.structure.bridge.sender.SenderInterface;

public class OSGPolicy extends Policy{
    public OSGPolicy(SenderInterface sender) {
        super(sender);
    }

    public void sendPolicy() {
        super.sendPolicy("OSGPolicy");
    }
}
