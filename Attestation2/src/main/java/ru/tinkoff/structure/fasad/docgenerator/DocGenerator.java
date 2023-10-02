package ru.tinkoff.structure.fasad.docgenerator;

public class DocGenerator {

    public String createTitle(String title) {
        return "Заголовок: " + title;
    }

    public String createBody(String body) {
        return body;
    }

    public String createEndWithSignature(String imageSeal, String bankInfo) {
        return "Документ от банка " + bankInfo + " " + imageSeal;
    }
}
