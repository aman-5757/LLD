package org.lld.solid.DependencyInversion.BadCode;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(EmailService emailService, SMSService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void notifyBySMS(String message) {
        smsService.sendSMS(message);
    }

    public void notifyByEmail(String message) {
        emailService.sendEmail(message);
    }
}
