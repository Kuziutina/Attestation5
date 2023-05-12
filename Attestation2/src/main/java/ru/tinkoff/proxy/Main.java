package ru.tinkoff.proxy;

import ru.tinkoff.proxy.createdocument.CreateDocumentService;
import ru.tinkoff.proxy.createdocument.CreateDocumentServiceInterface;
import ru.tinkoff.proxy.createdocument.CreateDocumentWithoutDuplicateService;

public class Main {

    public static void main(String[] args) {
        CreateDocumentServiceInterface createDocumentService = new CreateDocumentWithoutDuplicateService(new CreateDocumentService());

        createDocumentService.createPolicy(1, "document");
    }
}
