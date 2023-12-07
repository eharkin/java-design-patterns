package main.patterns.creational.factory.payment;

import java.math.BigDecimal;

public interface Payment {
    // also we are not violating interface segregation
    void acceptPayments(BigDecimal amount);
}
