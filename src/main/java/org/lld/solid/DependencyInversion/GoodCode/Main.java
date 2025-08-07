package org.lld.solid.DependencyInversion.GoodCode;

public class Main {
    public static void main(String[] args) {
        NotificationService smsNotification = new NotificationService(new SMSService());
        smsNotification.notify("OTP is 6793");

        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.notify("Today's update");
    }
}
