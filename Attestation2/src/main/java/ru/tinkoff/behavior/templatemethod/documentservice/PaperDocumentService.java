package ru.tinkoff.behavior.templatemethod.documentservice;

public class PaperDocumentService extends DocumentService {

    @Override
    public void printDocument() {
        System.out.println("Напечатано на принтере");
    }

    @Override
    public void signDocument() {
        System.out.println("Отнесли к руководителю и он подписал и поставил печать");;
    }

    @Override
    public void sendDocument() {
        System.out.println("Положили в конверт и отправили");;
    }
}
