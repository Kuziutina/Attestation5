package ru.tinkoff.create.abstractfactory;

import ru.tinkoff.create.abstractfactory.hc.documentservie.HCEmailDocumentService;
import ru.tinkoff.create.abstractfactory.hc.documentservie.HCPaperDocumentService;
import ru.tinkoff.create.abstractfactory.hc.documentservie.HCPolicyDocumentService;
import ru.tinkoff.create.abstractfactory.ifl.documentservie.IFLEmailDocumentService;
import ru.tinkoff.create.abstractfactory.ifl.documentservie.IFLPaperDocumentService;

public class Main {
    public static void main(String[] args) {
        PolicyDocumentService service = new HCPaperDocumentService();
        createAndPrintDocu(service, "HC 1234");

        service = new HCEmailDocumentService();
        createAndPrintDocu(service, "HC 1235");

        service = new IFLEmailDocumentService();
        createAndPrintDocu(service, "IFL 1236");

        service = new IFLPaperDocumentService();
        createAndPrintDocu(service, "IFL 1237");
    }

    private static void createAndPrintDocu(PolicyDocumentService service, String s) {
        service.createPolicyDocument(s);
        service.sendDocument(s);
    }
}
