package ru.tinkoff.structure.proxy.createdocument;

public class CreateDocumentWithoutDuplicateService implements CreateDocumentServiceInterface {
    private final CreateDocumentServiceInterface createDocumentService;

    public CreateDocumentWithoutDuplicateService(CreateDocumentServiceInterface createDocumentService) {
        this.createDocumentService = createDocumentService;
    }

    @Override
    public void createPolicy(long id, String document) {
        if (isHasDocument(id)) {
            deleteDocument(id);
        }
        createDocumentService.createPolicy(id, document);
    }

    private boolean isHasDocument(long id) {
        return false;
    }

    private void deleteDocument(long id) {
        System.out.println("delete document");
    }

}
