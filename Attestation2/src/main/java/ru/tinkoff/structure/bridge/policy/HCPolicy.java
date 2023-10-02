package ru.tinkoff.structure.bridge.policy;

import ru.tinkoff.structure.bridge.sender.SenderInterface;

public class HCPolicy extends Policy{
    public HCPolicy(SenderInterface sender) {
        super(sender);
    }

    public void sendPolicy() {
        super.sendPolicy("HCPolicy");
    }
}
