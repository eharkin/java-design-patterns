package main.patterns.creational.factory.computer;

public class Application {

    public static void main(String[] args) {
        String ram = "8GB";
        String hdd = "320GB";
        String cpu = "Intel";

        Computer computer = ComputerFactory.getLaptopDetails(ram, hdd, cpu);
        System.out.println("Laptop Configs:::" + computer);
    }
}
