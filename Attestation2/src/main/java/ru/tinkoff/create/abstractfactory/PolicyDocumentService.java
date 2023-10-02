package ru.tinkoff.create.abstractfactory;

public interface PolicyDocumentService {

    public void createPolicyDocument(String policy);

    public PolicyDocumentSender createSender();

    public void sendDocument(String policy);
}
