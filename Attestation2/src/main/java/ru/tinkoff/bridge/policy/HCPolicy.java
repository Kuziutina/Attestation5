package ru.tinkoff.bridge.policy;

import ru.tinkoff.bridge.sender.SenderInterface;

public class HCPolicy extends Policy{
    public HCPolicy(SenderInterface sender) {
        super(sender);
    }

    public void sendPolicy() {
        super.sendPolicy("HCPolicy");
    }
}
