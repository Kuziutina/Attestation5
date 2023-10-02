package ru.tinkoff.behavior.strategy;

import ru.tinkoff.behavior.strategy.strategy.NotifyStrategy;

public class PolicyCreator {
    private NotifyStrategy notifier;

    public void setNotifier(NotifyStrategy notifier) {
        this.notifier = notifier;
    }

    public void createPolicy(String policy) {
        System.out.println("Создание полиса " + policy);
        notifier.notify("Спасибо за приобретение полиса " + policy);
    }
}
