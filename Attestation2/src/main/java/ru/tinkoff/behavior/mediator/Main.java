package ru.tinkoff.behavior.mediator;


import ru.tinkoff.behavior.mediator.creator.PolicyCreator;

public class Main {
    public static void main(String[] args) {
        CreatePolicyMediator mediator = new CreatePolicyMediator();
        mediator.getPolicyCreator().createPolicy();
        mediator.getTaskWorker().closeMainActivity();
    }
}
