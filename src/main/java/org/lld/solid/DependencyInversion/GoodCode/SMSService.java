package org.lld.solid.DependencyInversion.GoodCode;

public class SMSService implements NotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("SMS sending message: " + message);
    }
}
