package ru.tinkoff.behavior.observer;

import ru.tinkoff.behavior.observer.creator.PolicyCreator;
import ru.tinkoff.behavior.observer.subscriber.LoggingListener;
import ru.tinkoff.behavior.observer.subscriber.SMSSenderListener;
import ru.tinkoff.behavior.observer.subscriber.TaskCreatorListener;

public class Main {
    public static void main(String[] args) {
        PolicyCreator policyCreator = new PolicyCreator();
        LoggingListener loggingListener = new LoggingListener();
        TaskCreatorListener taskCreatorListener = new TaskCreatorListener();
        SMSSenderListener smsSenderListener = new SMSSenderListener();
        policyCreator.subscribe(loggingListener);
        policyCreator.subscribe(taskCreatorListener);

        //Днем при создании полиса логируем и создаем задачу
        policyCreator.createPolicy("HC 1234");

        //При уходе менеджера с рабочего места - шлем ему смс
        policyCreator.subscribe(smsSenderListener);
        policyCreator.createPolicy("Auto 3874");

        //При возвращении прекращаем
        policyCreator.unsubscribe(smsSenderListener);
        policyCreator.createPolicy("TP 3853");

    }
}
