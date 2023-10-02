package ru.tinkoff.behavior.templatemethod;

import ru.tinkoff.behavior.templatemethod.documentservice.DocumentService;
import ru.tinkoff.behavior.templatemethod.documentservice.PaperDocumentService;
import ru.tinkoff.behavior.templatemethod.documentservice.SampleDocumentService;

public class Main {
    public static void main(String[] args) {
        DocumentService documentService = new DocumentService();
        documentService.createAndSendDocument("Auto 1234");

        documentService = new SampleDocumentService();
        documentService.createAndSendDocument("TP 1235");

        documentService = new PaperDocumentService();
        documentService.createAndSendDocument("OSG 1236");
    }
}
