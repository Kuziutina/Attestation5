package ru.tinkoff.behavior.mediator;

public class PolicyPayment implements ComponentInterface {
    private MediatorInterface mediator;

    public PolicyPayment(MediatorInterface mediator) {
        this.mediator = mediator;
    }

    public void createPaymentLink() {
        System.out.println("Создана ссылка для оплаты");
    }
}
