package ru.tinkoff.behavior.state.state;

import ru.tinkoff.behavior.state.Policy;

public class Draft implements State{
    private Policy policy;

    public Draft(Policy policy) {
        this.policy = policy;
    }

    @Override
    public void accept() {
        if (policy.getPremium() == null) {
            throw new IllegalStateException("Нельзя перевести без расчитанной премии");
        }
        System.out.println("Переводим полс в статус Quoted");
        policy.changeState(new Quoted(policy));
    }

    @Override
    public void calculate() {
        System.out.println("расчитавыем премию");
        policy.setPremium(5.3);
    }

    @Override
    public void generatePolicyDocument() {
        System.out.println("Генерируем документ без данных и на тестовой бумаге");
    }
}
