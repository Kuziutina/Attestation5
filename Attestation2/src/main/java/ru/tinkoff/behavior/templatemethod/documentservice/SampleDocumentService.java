package ru.tinkoff.behavior.templatemethod.documentservice;

public class SampleDocumentService extends DocumentService{

    @Override
    public void createPolicyDocument(String policy) {
        System.out.println("Создаем документ с тестовыми данными на бумаге для sample");
    }
}
