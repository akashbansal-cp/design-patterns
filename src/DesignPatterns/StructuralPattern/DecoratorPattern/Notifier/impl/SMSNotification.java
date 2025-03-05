package DesignPatterns.StructuralPattern.DecoratorPattern.Notifier.impl;

import DesignPatterns.StructuralPattern.DecoratorPattern.Notifier.Notifier;

public class SMSNotification implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("sms sent: " + message);
    }
}
