package ru.tinkoff.behavior.strategy.strategy;

public class EmailNotifier implements NotifyStrategy{
    @Override
    public void notify(String text) {
        System.out.println("Отправить электронное письмо: " + text);
    }
}
