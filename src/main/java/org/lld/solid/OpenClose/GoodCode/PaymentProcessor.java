package org.lld.solid.OpenClose.GoodCode;

public class PaymentProcessor {
    public void processPayment(PaymentMehtod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
