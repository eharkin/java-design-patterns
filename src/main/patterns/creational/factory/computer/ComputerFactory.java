package main.patterns.creational.factory.computer;

import java.math.BigDecimal;

public class ComputerFactory {

    // so we are not violating single responsibility or open closed design principles
    public static Laptop getLaptopDetails(String ram, String hdd, String cpu) {
        // get laptop details
        return ram != null ? new Laptop(ram, hdd, cpu) : null;
    }
}
