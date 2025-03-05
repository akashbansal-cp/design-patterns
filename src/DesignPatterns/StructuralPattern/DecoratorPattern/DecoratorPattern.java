package DesignPatterns.StructuralPattern.DecoratorPattern;

import DesignPatterns.StructuralPattern.DecoratorPattern.Notifier.Notifier;
import DesignPatterns.StructuralPattern.DecoratorPattern.Notifier.impl.NotificationDecorator;

public class DecoratorPattern {

    Notifier criticalNotifier = new NotificationDecorator(true, true, true);
    Notifier nonMobileNotifier = new NotificationDecorator(false, true, true);
    Notifier corporateNotifier = new NotificationDecorator(false, false, true);

    public void doStuff(){
        criticalNotifier.sendNotification("critical message");
        nonMobileNotifier.sendNotification("non_mobile message");
        corporateNotifier.sendNotification("corporate_message");
    }


}
