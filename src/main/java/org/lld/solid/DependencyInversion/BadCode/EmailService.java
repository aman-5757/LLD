package org.lld.solid.DependencyInversion.BadCode;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
