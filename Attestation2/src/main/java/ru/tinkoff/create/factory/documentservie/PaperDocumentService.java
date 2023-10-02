package ru.tinkoff.create.factory.documentservie;

import ru.tinkoff.create.factory.sender.PaperDocumentSender;
import ru.tinkoff.create.factory.sender.PolicyDocumentSender;

public class PaperDocumentService extends PolicyDocumentService{
    @Override
    public PolicyDocumentSender createSender() {
        return new PaperDocumentSender();
    }
}
