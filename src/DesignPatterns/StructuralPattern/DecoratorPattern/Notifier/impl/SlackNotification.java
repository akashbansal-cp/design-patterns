package DesignPatterns.StructuralPattern.DecoratorPattern.Notifier.impl;

import DesignPatterns.StructuralPattern.DecoratorPattern.Notifier.Notifier;

public class SlackNotification implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("slack notification sent: " + message);
    }
}
