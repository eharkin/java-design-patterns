package main.patterns.creational.factory.payment;

import java.math.BigDecimal;

public class GooglePayment implements Payment {
    @Override
    public void acceptPayments(BigDecimal amount) {
        System.out.println(String.format("Google Payment is being made %s", amount));
    }
}
