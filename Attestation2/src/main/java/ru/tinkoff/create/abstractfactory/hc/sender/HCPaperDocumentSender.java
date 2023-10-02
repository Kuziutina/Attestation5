package ru.tinkoff.create.abstractfactory.hc.sender;

import ru.tinkoff.create.abstractfactory.PolicyDocumentSender;

public class HCPaperDocumentSender implements PolicyDocumentSender {
    @Override
    public void send(String policy) {
        System.out.println("Печатаем документ на бумаге для НС");
        System.out.println("Кладем рекламу по ДМС от партнеров");
        System.out.println("Кладем документ в конверт");
        System.out.println("Отправляем по обычной почте");
    }
}
