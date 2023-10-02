package ru.tinkoff.create.factory.sender;

public class PaperDocumentSender implements PolicyDocumentSender{
    @Override
    public void send(String policy) {
        System.out.println("Печатаем документ на бумаге");
        System.out.println("Кладем документ в конверт");
        System.out.println("Отправляем по обычной почте");
    }
}
