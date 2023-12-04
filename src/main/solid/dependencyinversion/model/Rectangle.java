package main.solid.dependencyinversion.model;

import main.solid.dependencyinversion.Shape;

public class Rectangle implements Shape {
    @Override
    public double area() {
        return 500;
    }
}
