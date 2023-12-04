package main.solid.dependencyinversion.model;

import main.solid.dependencyinversion.Shape;
import main.solid.dependencyinversion.ThreeDimensionShape;

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
