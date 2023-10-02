package ru.tinkoff.create.abstractfactory.ifl.sender;

import ru.tinkoff.create.abstractfactory.PolicyDocumentSender;

public class IFLPaperDocumentSender implements PolicyDocumentSender {
    @Override
    public void send(String policy) {
        System.out.println("Печатаем документ на бумаге для ИФЛ");
        System.out.println("Кладем документ в конверт");
        System.out.println("Добавляем рекламу по ипотеке Тинькофф");
        System.out.println("Отправляем по обычной почте");
    }
}
