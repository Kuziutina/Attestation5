package ru.tinkoff.structure.proxy;

import ru.tinkoff.structure.proxy.createdocument.CreateDocumentService;
import ru.tinkoff.structure.proxy.createdocument.CreateDocumentServiceInterface;
import ru.tinkoff.structure.proxy.createdocument.CreateDocumentWithoutDuplicateService;

public class Main {

    public static void main(String[] args) {
        CreateDocumentServiceInterface createDocumentService = new CreateDocumentWithoutDuplicateService(new CreateDocumentService());

        createDocumentService.createPolicy(1, "document");
    }
}
