package ru.tinkoff.bridge.sender;

public class MailSender implements SenderInterface {
    @Override
    public void sendPolicy(String document) {
        System.out.println("Print document " + document);
        System.out.println("Set activity to send policy to home address");
    }
}
