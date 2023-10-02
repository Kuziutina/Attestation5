package ru.tinkoff.behavior.visitor;

import ru.tinkoff.behavior.visitor.element.Cash;
import ru.tinkoff.behavior.visitor.element.CreditCart;
import ru.tinkoff.behavior.visitor.element.PaymentAccount;
import ru.tinkoff.behavior.visitor.element.PaymentMethod;

import java.util.List;

public class PaymentVisitor {

    public void payPacket(List<PaymentMethod> payments) {
        payments.forEach(payment -> payment.accept(this));
    }

    public void payForCreditCart(CreditCart creditCart) {
        System.out.println("Оплата с помощью кредитной карты");
    }

    public void payForCash(Cash cash) {
        System.out.println("Оплата с помощью налички");
    }

    public void payForPaymentAccount(PaymentAccount paymentAccount) {
        System.out.println("Оплата с помощью расчетного счета");
    }
}
