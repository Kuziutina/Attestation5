package ru.tinkoff.structure.decorator;

import ru.tinkoff.structure.decorator.sender.Sender;
import ru.tinkoff.structure.decorator.sender.SenderInterface;
import ru.tinkoff.structure.decorator.sender.decorator.EmailSenderDecorator;
import ru.tinkoff.structure.decorator.sender.decorator.PushSenderDecorator;
import ru.tinkoff.structure.decorator.sender.decorator.SmsSenderDecorator;

public class User {
    private boolean isPaymentEmailNotification;
    private boolean isPaymentSmsNotification;
    private boolean isPaymentPushNotification;
    private String fio;

    public User(String fio, boolean isPaymentEmailNotification, boolean isPaymentSmsNotification, boolean isPaymentPushNotification) {
        this.fio = fio;
        this.isPaymentEmailNotification = isPaymentEmailNotification;
        this.isPaymentSmsNotification = isPaymentSmsNotification;
        this.isPaymentPushNotification = isPaymentPushNotification;
    }

    public void sendPaymentNotification() {
        String text = fio + " не забудьте оплатить полис";
        SenderInterface sender = new Sender();
        if (isPaymentSmsNotification) {
            sender = new SmsSenderDecorator(sender);
        }
        if (isPaymentPushNotification) {
            sender = new PushSenderDecorator(sender);
        }
        if (isPaymentEmailNotification) {
            sender = new EmailSenderDecorator(sender);
        }
        sender.send(text);
    }
}
