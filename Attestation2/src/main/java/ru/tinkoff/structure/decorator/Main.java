package ru.tinkoff.structure.decorator;

public class Main {

    public static void main(String[] args) {
        User ma = new User("Михаил Анатольевич", true, false, false);
        User mi = new User("Марья Ивановна", true, true, true);

        ma.sendPaymentNotification();
        mi.sendPaymentNotification();
    }
}
