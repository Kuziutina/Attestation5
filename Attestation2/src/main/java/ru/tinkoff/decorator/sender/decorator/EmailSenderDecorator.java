package ru.tinkoff.decorator.sender.decorator;

import ru.tinkoff.decorator.sender.SenderInterface;

public class EmailSenderDecorator extends SenderDecorator {

    public EmailSenderDecorator(SenderInterface sender) {
        super(sender);
    }

    @Override
    public void send(String text) {
        super.send(text);
        System.out.println("Configure email");
        System.out.println("Send to email: " + text);
    }
}
