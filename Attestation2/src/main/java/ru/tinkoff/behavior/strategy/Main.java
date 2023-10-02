package ru.tinkoff.behavior.strategy;

import ru.tinkoff.behavior.strategy.strategy.EmailNotifier;
import ru.tinkoff.behavior.strategy.strategy.MailNotifier;
import ru.tinkoff.behavior.strategy.strategy.SMSNotifier;

public class Main {
    public static void main(String[] args) {
        PolicyCreator policyCreator = new PolicyCreator();
        EmailNotifier emailNotifier = new EmailNotifier();
        MailNotifier mailNotifier = new MailNotifier();
        SMSNotifier smsNotifier = new SMSNotifier();

        policyCreator.setNotifier(emailNotifier);
        policyCreator.createPolicy("auto 1234");

        policyCreator.setNotifier(mailNotifier);
        policyCreator.createPolicy("auto 1235");

        policyCreator.setNotifier(smsNotifier);
        policyCreator.createPolicy("auto 1236");
    }
}
