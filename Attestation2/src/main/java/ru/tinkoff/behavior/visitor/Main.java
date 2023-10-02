package ru.tinkoff.behavior.visitor;

import ru.tinkoff.behavior.visitor.element.Cash;
import ru.tinkoff.behavior.visitor.element.CreditCart;
import ru.tinkoff.behavior.visitor.element.PaymentAccount;
import ru.tinkoff.behavior.visitor.element.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PaymentMethod> payments = new ArrayList<>();
        payments.add(new CreditCart());
        payments.add(new Cash());
        payments.add(new PaymentAccount());
        payments.add(new CreditCart());

        PaymentVisitor paymentVisitor = new PaymentVisitor();
        paymentVisitor.payPacket(payments);
    }
}
