package main.solid.model;

import main.solid.openclosed.Shape;

public class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    // to achieve open-closed principle
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
