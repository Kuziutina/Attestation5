package ru.tinkoff.behavior.mediator;

public class TaskWorker implements ComponentInterface {
    private MediatorInterface mediator;

    public TaskWorker(MediatorInterface mediator) {
        this.mediator = mediator;
    }

    public void createActivity() {
        System.out.println("Создана задача на обзвон и уточнение деталей");
    }

    public void closeMainActivity() {
        System.out.println("Закрыта задача на оформление полиса");
        mediator.notify(this);
    }
}
