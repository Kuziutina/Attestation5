package ru.tinkoff.structure.decorator.sender.decorator;

import ru.tinkoff.structure.decorator.sender.SenderInterface;

public class PushSenderDecorator extends SenderDecorator {


    public PushSenderDecorator(SenderInterface sender) {
        super(sender);
    }

    @Override
    public void send(String text) {
        super.send(text);
        System.out.println("Configure push");
        System.out.println("Send to push: " + text);
    }
}
