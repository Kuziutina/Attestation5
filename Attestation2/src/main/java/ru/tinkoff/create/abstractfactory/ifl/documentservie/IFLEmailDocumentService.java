package ru.tinkoff.create.abstractfactory.ifl.documentservie;

import ru.tinkoff.create.abstractfactory.PolicyDocumentSender;
import ru.tinkoff.create.abstractfactory.ifl.sender.IFLEmailDocumentSender;

public class IFLEmailDocumentService extends IFLPolicyDocumentService {
    @Override
    public PolicyDocumentSender createSender() {
        return new IFLEmailDocumentSender();
    }
}
