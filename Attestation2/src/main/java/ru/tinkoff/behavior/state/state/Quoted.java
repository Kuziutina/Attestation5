package ru.tinkoff.behavior.state.state;

import ru.tinkoff.behavior.state.Policy;

public class Quoted implements State{
    private Policy policy;

    public Quoted(Policy policy) {
        this.policy = policy;
    }

    @Override
    public void accept() {
        System.out.println("Переводим полс в статус Bound");
        policy.changeState(new Bound(policy));
    }

    @Override
    public void calculate() {
        throw new IllegalStateException("not supported");
    }

    @Override
    public void generatePolicyDocument() {
        System.out.println("Генерируем документ с настоящими данными и на тестовой бумаге");
    }
}
