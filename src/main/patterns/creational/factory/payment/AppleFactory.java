package main.patterns.creational.factory.payment;

import java.math.BigDecimal;

public class AppleFactory {

    // so we are not violating single responsibility or open closed design principles
    public ApplePayment getPayment(BigDecimal amount) {

        // lazy initialization but we are dependant on the amount valdation
        ApplePayment applePayment = null;
        if(amount.doubleValue() == 100.00) {
            applePayment = new ApplePayment();
            applePayment.acceptPayments(amount);
        }
        return applePayment;
    }
}
