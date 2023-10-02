package ru.tinkoff.create.abstractfactory.ifl.documentservie;

import ru.tinkoff.create.abstractfactory.PolicyDocumentSender;
import ru.tinkoff.create.abstractfactory.ifl.sender.IFLPaperDocumentSender;

public class IFLPaperDocumentService extends IFLPolicyDocumentService {
    @Override
    public PolicyDocumentSender createSender() {
        return new IFLPaperDocumentSender();
    }
}
