package ru.tinkoff.behavior.chainresponsibility.policy.component;

public class TaskCreator extends Component {
    @Override
    public void handle(String info) {
        System.out.println("Создали задачу для формления полиса");
        handleNextIfNeeded(info);
    }
}
