package ru.tinkoff.create.abstractfactory.ifl.documentservie;

import ru.tinkoff.create.abstractfactory.PolicyDocumentSender;
import ru.tinkoff.create.abstractfactory.PolicyDocumentService;

abstract public class IFLPolicyDocumentService implements PolicyDocumentService {
    private PolicyDocumentSender sender;

    public void createPolicyDocument(String policy) {
        System.out.println("Считаем доп данные для ИФЛ");
        System.out.println("Заносим квартиру в наш реестр квартир");
        System.out.println("Сгенерирован документ для полиса " + policy);
    }

    abstract public PolicyDocumentSender createSender();

    public void sendDocument(String policy) {
        System.out.println("Отправляем документ " + policy);
        sender = createSender();
        sender.send(policy);
    }

}
