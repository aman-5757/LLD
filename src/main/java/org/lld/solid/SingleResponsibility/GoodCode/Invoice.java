package org.lld.solid.SingleResponsibility.GoodCode;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generating and printing for amount: " + amount);
    }
}
