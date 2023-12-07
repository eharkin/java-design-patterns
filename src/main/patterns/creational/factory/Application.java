package main.patterns.creational.factory;

public class Application {

    public static Notification notification;

    public static void main(String[] args) {
        String test = "SMS";
        if(test.equalsIgnoreCase("SMS")) {
            notification = new SMSNotification();
            notification.notifyUser();
        }
    }
}
