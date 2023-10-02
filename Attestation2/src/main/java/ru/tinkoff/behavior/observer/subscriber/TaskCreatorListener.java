package ru.tinkoff.behavior.observer.subscriber;

import ru.tinkoff.behavior.observer.core.TaskCreator;

public class TaskCreatorListener implements Subscriber{
    private TaskCreator taskCreator;

    public TaskCreatorListener() {
        this.taskCreator = new TaskCreator();
    }

    @Override
    public void doLogic(String policy) {
        taskCreator.createTask(policy);
    }
}
