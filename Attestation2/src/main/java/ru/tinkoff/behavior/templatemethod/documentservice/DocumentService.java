package ru.tinkoff.behavior.templatemethod.documentservice;

public class DocumentService {

    public void createAndSendDocument(String policy) {
        createPolicyDocument(policy);
        printDocument();
        signDocument();
        sendDocument();
    }

    public void createPolicyDocument(String policy) {
        System.out.println("Создание документа с реальными данными на спец бумаге (с лендингом и т.п.)");
    }

    public void printDocument() {

    }

    public void signDocument() {
        System.out.println("Подпись ЭЦП");
    }

    public void sendDocument() {
        System.out.println("Отправка документа на электронную почту");
    }
}
