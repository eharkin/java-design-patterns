package main.solid.liskovsub;

import main.solid.model.Engine;

/*
Simply put, if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program.
 */
// this code is fine as it meets liskov sub
public class MotorCar implements Car {

    private Engine engine;

    @Override
    public boolean turnOnEngine() {
        return false;
    }

    @Override
    public int horsePower() {
        return 1500;
    }
}
