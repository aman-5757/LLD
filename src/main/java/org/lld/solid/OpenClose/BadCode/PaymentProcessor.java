package org.lld.solid.OpenClose.BadCode;

public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Making payment via CreditCard: " + amount);
        }else if(paymentMethod.equals("DebitCard")) {
            System.out.println("Making payment via DebitCard: " + amount);
        }else if(paymentMethod.equals("PayPal")) {
            System.out.println("Making payment via PayPal: " + amount);
        }else{
            System.out.println("Unknown payment method: " + paymentMethod);
        }
    }
}
