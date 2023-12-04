package main.solid.liskovsub;

public class Application {

    public static void main(String[] args) {
        MotorCar motorCar = new MotorCar();
        ElectricCar electricCar = new ElectricCar();

        motorCar.horsePower();
        motorCar.turnOnEngine();

        // code throws an exception as it violates liskov design principle
        electricCar.horsePower();
        electricCar.turnOnEngine();
    }
}
