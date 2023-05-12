package ru.tinkoff.decorator;

import ru.tinkoff.decorator.sender.*;
import ru.tinkoff.decorator.sender.decorator.EmailSenderDecorator;
import ru.tinkoff.decorator.sender.decorator.PushSenderDecorator;
import ru.tinkoff.decorator.sender.decorator.SmsSenderDecorator;

public class Main {

    public static void main(String[] args) {
        User ma = new User("Михаил Анатольевич", true, false, false);
        User mi = new User("Марья Ивановна", true, true, true);

        ma.sendPaymentNotification();
        mi.sendPaymentNotification();
    }
}
