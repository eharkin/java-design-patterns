package main.patterns.creational.factory;

public class SMSCreator extends NotificationFactory{
    @Override
    public SMSNotification createMessages() {
        return new SMSNotification();
    }
}
