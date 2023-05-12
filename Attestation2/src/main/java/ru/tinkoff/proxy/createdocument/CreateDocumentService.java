package ru.tinkoff.proxy.createdocument;

public class CreateDocumentService implements CreateDocumentServiceInterface {
    //Предположим, это сторонний сервис - и он позволяет нам создавать
    //документы с одинаковым id (т.е. вызывая 3 раза - получаем 3 одинаковых документа)
    @Override
    public void createPolicy(long id, String document) {
        System.out.println("createDocument " + document + " with id: " + id);
    }
}
