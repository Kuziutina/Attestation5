package ru.tinkoff.behavior.chainresponsibility;

import ru.tinkoff.behavior.chainresponsibility.policy.component.*;

public class Main {
    public static void main(String[] args) {
        ComponentInterface autoCreatorPolicyValidator = new Validator();
        ComponentInterface autoCreatorPolicyAppCreator = new AppCreator();
        ComponentInterface autoCreatorPolicyPolicyCreator = new PolicyCreator();
        autoCreatorPolicyValidator.setNext(autoCreatorPolicyAppCreator);
        autoCreatorPolicyAppCreator.setNext(autoCreatorPolicyPolicyCreator);

        autoCreatorPolicyValidator.handle("Policy auto");


        ComponentInterface handCreatorPolicyValidator = new Validator();
        ComponentInterface handCreatorPolicyAppCreator = new AppCreator();
        ComponentInterface handCreatorPolicyTaskCreator = new TaskCreator();
        ComponentInterface handCreatorPolicyPolicyCreator = new PolicyCreator();
        handCreatorPolicyValidator.setNext(handCreatorPolicyAppCreator);
        handCreatorPolicyAppCreator.setNext(handCreatorPolicyTaskCreator);
        handCreatorPolicyTaskCreator.setNext(handCreatorPolicyPolicyCreator);

        handCreatorPolicyValidator.handle("Policy hand");

    }
}
