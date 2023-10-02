package ru.tinkoff.create.abstractfactory.hc.documentservie;

import ru.tinkoff.create.abstractfactory.PolicyDocumentSender;
import ru.tinkoff.create.abstractfactory.hc.sender.HCPaperDocumentSender;

public class HCPaperDocumentService extends HCPolicyDocumentService {
    @Override
    public PolicyDocumentSender createSender() {
        return new HCPaperDocumentSender();
    }
}
