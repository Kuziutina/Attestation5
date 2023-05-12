package ru.tinkoff.fasad.creator;

import ru.tinkoff.fasad.bankapi.BankAPI;
import ru.tinkoff.fasad.docgenerator.DocGenerator;
import ru.tinkoff.fasad.ecp.ECPAPI;
import ru.tinkoff.fasad.imagestorage.ImageStorage;

public class DocumentCreator implements DocumentCreatorInterface{
    private BankAPI bankAPI;
    private ECPAPI ecpAPI;
    private ImageStorage imageStorage;
    private DocGenerator docGenerator;

    //Для простоты создадим сервисы в конструкторе
    public DocumentCreator() {
        bankAPI = new BankAPI();
        ecpAPI = new ECPAPI();
        imageStorage = new ImageStorage();
        docGenerator = new DocGenerator();

    }

    public String createDocument() {
        String bankInfo = bankAPI.getBankInfo();
        String sealImage = imageStorage.getImage("Печть");
        StringBuilder document = new StringBuilder();
        document.append(docGenerator.createTitle("Полис"));
        document.append(docGenerator.createBody("Застрахована машинка"));
        document.append(docGenerator.createEndWithSignature(sealImage, bankInfo));
        ecpAPI.sighDocument(document.toString());

        return document.toString();
    }

    public String createInstruction() {
        StringBuilder document = new StringBuilder();
        document.append(docGenerator.createTitle("Инструкция"));
        document.append(docGenerator.createBody("Платите вовремя"));

        return document.toString();
    }


}
