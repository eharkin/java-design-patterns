package main.patterns.creational.factory;

// concrete product
public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS");
    }
}
