package main.solid.interfacesegregation.model;

import main.solid.interfacesegregation.Shape;

public class Rectangle implements Shape {
    @Override
    public double area() {
        return 500;
    }
}
