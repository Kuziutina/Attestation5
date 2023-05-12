package ru.tinkoff.decorator.sender.decorator;

import ru.tinkoff.decorator.sender.SenderInterface;

public class SmsSenderDecorator extends SenderDecorator {

    public SmsSenderDecorator(SenderInterface sender) {
        super(sender);
    }

    @Override
    public void send(String text) {
        super.send(text);
        System.out.println("Configure sms");
        System.out.println("Send to sms: " + text);
    }
}