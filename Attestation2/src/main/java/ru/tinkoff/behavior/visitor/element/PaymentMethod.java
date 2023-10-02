package ru.tinkoff.behavior.visitor.element;

import ru.tinkoff.behavior.visitor.PaymentVisitor;

public interface PaymentMethod {
    void accept(PaymentVisitor visitor);
}
