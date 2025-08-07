package org.lld.solid.OpenClose.GoodCode;

public class CreditCard implements PaymentMehtod {
    @Override
    public void pay(double amount) {
        System.out.println("Making payment via credit card");
    }
}
