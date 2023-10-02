package ru.tinkoff.behavior.strategy.strategy;

public class MailNotifier implements NotifyStrategy{
    @Override
    public void notify(String text) {
        System.out.println("Отправить бумажное письмо: " + text);
    }
}
