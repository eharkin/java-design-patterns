package main.solid.interfacesegregation.model;

import main.solid.interfacesegregation.Shape;
import main.solid.interfacesegregation.ThreeDimensionShape;

public class Cube implements Shape, ThreeDimensionShape {
    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 300;
    }
}
