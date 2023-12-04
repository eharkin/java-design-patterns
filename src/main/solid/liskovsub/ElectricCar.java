package main.solid.liskovsub;

public class ElectricCar implements Car {
    @Override
    // now this method in subclass does not sub the parent class so it violates this design principle
    public boolean turnOnEngine() {
        throw new IllegalArgumentException("I Don't have an engine");
    }

    @Override
    public int horsePower() {
        return 1500;
    }
}
