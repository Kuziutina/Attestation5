package ru.tinkoff.behavior.visitor.element;

import ru.tinkoff.behavior.visitor.PaymentVisitor;

public class CreditCart implements PaymentMethod{

    public void accept(PaymentVisitor visitor) {
        visitor.payForCreditCart(this);
    }
}
