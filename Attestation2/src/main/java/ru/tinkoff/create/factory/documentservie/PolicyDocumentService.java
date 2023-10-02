package ru.tinkoff.create.factory.documentservie;

import ru.tinkoff.create.factory.sender.PolicyDocumentSender;

abstract public class PolicyDocumentService {
    private PolicyDocumentSender sender;

    public void createPolicyDocument(String policy) {
        System.out.println("Сгенерирован документ для полиса " + policy);
    }

    abstract public PolicyDocumentSender createSender();

    public void sendDocument(String policy) {
        System.out.println("Отправляем документ " + policy);
        sender = createSender();
        sender.send(policy);
    }

}
