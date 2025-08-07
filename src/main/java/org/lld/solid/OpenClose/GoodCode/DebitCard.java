package org.lld.solid.OpenClose.GoodCode;

public class DebitCard implements PaymentMehtod {
    @Override
    public void pay(double amount) {
        System.out.println("Making payment via debit card");
    }
}