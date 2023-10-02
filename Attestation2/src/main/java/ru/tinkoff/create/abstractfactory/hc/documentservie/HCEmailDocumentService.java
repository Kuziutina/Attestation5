package ru.tinkoff.create.abstractfactory.hc.documentservie;

import ru.tinkoff.create.abstractfactory.PolicyDocumentSender;
import ru.tinkoff.create.abstractfactory.hc.sender.HCEmailDocumentSender;

public class HCEmailDocumentService extends HCPolicyDocumentService {
    @Override
    public PolicyDocumentSender createSender() {
        return new HCEmailDocumentSender();
    }
}
