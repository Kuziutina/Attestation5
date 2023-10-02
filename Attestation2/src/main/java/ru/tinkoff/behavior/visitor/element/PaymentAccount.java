package ru.tinkoff.behavior.visitor.element;

import ru.tinkoff.behavior.visitor.PaymentVisitor;

public class PaymentAccount implements PaymentMethod{

    public void accept(PaymentVisitor visitor) {
        visitor.payForPaymentAccount(this);
    }
}
