package ru.tinkoff.structure.decorator.sender.decorator;

import ru.tinkoff.structure.decorator.sender.SenderInterface;

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
