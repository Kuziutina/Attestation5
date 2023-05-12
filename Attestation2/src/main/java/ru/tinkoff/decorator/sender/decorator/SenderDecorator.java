package ru.tinkoff.decorator.sender.decorator;

import ru.tinkoff.decorator.sender.SenderInterface;

public class SenderDecorator implements SenderInterface {

    private SenderInterface sender;

    public SenderDecorator() {
    }

    public SenderDecorator(SenderInterface sender) {
        this.sender = sender;
    }

    @Override
    public void send(String text) {
        sender.send(text);
    }
}
