package org.lld.solid.OpenClose.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMehtod paymentMehtod = new CreditCard();
        processor.processPayment(paymentMehtod, 100.0);
    }
}