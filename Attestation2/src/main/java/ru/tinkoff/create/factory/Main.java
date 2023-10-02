package ru.tinkoff.create.factory;

import ru.tinkoff.create.factory.documentservie.EmailDocumentService;
import ru.tinkoff.create.factory.documentservie.PaperDocumentService;
import ru.tinkoff.create.factory.documentservie.PolicyDocumentService;

public class Main {
    public static void main(String[] args) {
        PolicyDocumentService service = new PaperDocumentService();
        service.createPolicyDocument("AUTO 1234");
        service.sendDocument("AUTO 1234");

        service = new EmailDocumentService();
        service.createPolicyDocument("HC 1235");
        service.sendDocument("HC 1235");
    }
}
