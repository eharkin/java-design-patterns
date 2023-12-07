package main.patterns.creational.factory.payment;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        appleFactory.getPayment(BigDecimal.valueOf(100.00));
    }
}
