package ru.tinkoff.behavior.visitor.element;

import ru.tinkoff.behavior.visitor.PaymentVisitor;

public class Cash implements PaymentMethod{

    public void accept(PaymentVisitor visitor) {
        visitor.payForCash(this);
    }
}
