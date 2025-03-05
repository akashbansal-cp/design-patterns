package DesignPatterns.StructuralPattern.DecoratorPattern.Notifier.impl;

import DesignPatterns.StructuralPattern.DecoratorPattern.Notifier.Notifier;

import java.util.Objects;

public class NotificationDecorator implements Notifier {

    Notifier smsNotification;
    Notifier emailNotification;
    Notifier slackNotification;

    public NotificationDecorator(boolean sms, boolean email, boolean slack) {
        if (sms)
            smsNotification = new SMSNotification();
        if (email)
            emailNotification = new EmailNotification();
        if (slack)
            slackNotification = new SlackNotification();
    }

    @Override
    public void sendNotification(String message) {
        if (Objects.nonNull(smsNotification))
            smsNotification.sendNotification(message);
        if (Objects.nonNull(emailNotification))
            emailNotification.sendNotification(message);
        if (Objects.nonNull(slackNotification))
            slackNotification.sendNotification(message);
    }
}
