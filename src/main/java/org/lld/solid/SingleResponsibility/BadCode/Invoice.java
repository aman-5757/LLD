package org.lld.solid.SingleResponsibility.BadCode;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generating and printing for amount: " + amount);
    }

    public void saveToDatabase() {
        System.out.println("Invoice saving to database");
    }

    public void sendEmailNotification() {
        System.out.println("Sending email notification");
    }
}