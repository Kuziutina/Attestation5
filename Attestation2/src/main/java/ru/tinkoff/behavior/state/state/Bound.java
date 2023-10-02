package ru.tinkoff.behavior.state.state;

import ru.tinkoff.behavior.state.Policy;

public class Bound implements State{
    private Policy policy;

    public Bound(Policy policy) {
        this.policy = policy;
    }

    @Override
    public void accept() {
        throw new IllegalStateException("not supported");
    }

    @Override
    public void calculate() {
        throw new IllegalStateException("not supported");
    }

    @Override
    public void generatePolicyDocument() {
        System.out.println("Генерируем документ с данными, с печатями на официальном бланке");
    }
}
