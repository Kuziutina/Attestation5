package ru.tinkoff.create.abstractfactory.hc.sender;

import ru.tinkoff.create.abstractfactory.PolicyDocumentSender;

public class HCEmailDocumentSender implements PolicyDocumentSender {
    @Override
    public void send(String policy) {
        System.out.println("Отпраляем документ по электронной почте с рекламой и лендингом для HC");
    }
}
