package ru.tinkoff.behavior.strategy.strategy;

public class SMSNotifier implements NotifyStrategy{
    @Override
    public void notify(String text) {
        System.out.println("Отправить sms сообщение: " + text);
    }
}
