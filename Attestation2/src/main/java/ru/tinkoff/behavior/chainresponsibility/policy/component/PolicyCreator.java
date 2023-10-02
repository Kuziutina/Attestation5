package ru.tinkoff.behavior.chainresponsibility.policy.component;

public class PolicyCreator extends Component{
    @Override
    public void handle(String info) {
        System.out.println("Оформлен!");
        handleNextIfNeeded(info);
    }
}
