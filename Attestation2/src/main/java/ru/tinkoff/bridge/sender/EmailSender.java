package ru.tinkoff.bridge.sender;

public class EmailSender implements SenderInterface{
    @Override
    public void sendPolicy(String document) {
        System.out.println("Sign policy with ECP");
        System.out.println("Send Document to email " + document);
    }
}
