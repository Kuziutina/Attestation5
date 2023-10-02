package ru.tinkoff.create.prototype;

import ru.tinkoff.create.prototype.prototype.PolicyDocument;

public class Main {
    public static void main(String[] args) {
        PolicyDocument document = new PolicyDocument();
        document.setLending("lending ");
        document.setBody("body ");
        document.setSeal(true);
        System.out.println(document.createDocument());
        PolicyDocument documentClone = (PolicyDocument) document.clone();
        System.out.println(documentClone.createDocument());
    }
}
