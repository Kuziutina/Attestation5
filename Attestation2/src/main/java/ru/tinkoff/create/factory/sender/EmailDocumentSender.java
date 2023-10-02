package ru.tinkoff.create.factory.sender;

public class EmailDocumentSender implements PolicyDocumentSender{
    @Override
    public void send(String policy) {
        System.out.println("Отпраляем документ по электронной почте");
    }
}
