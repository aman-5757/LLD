package org.lld.solid.DependencyInversion.BadCode;

public class SMSService {
    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
