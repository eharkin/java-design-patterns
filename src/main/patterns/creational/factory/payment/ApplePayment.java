package main.patterns.creational.factory.payment;

import java.math.BigDecimal;

public class ApplePayment implements Payment {
    @Override
    public void acceptPayments(BigDecimal amount) {
        System.out.println(String.format("Apply Payment is being made %s", amount));
    }
}
