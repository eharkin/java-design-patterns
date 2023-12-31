package main.solid.interfacesegregation.model;

import main.solid.interfacesegregation.Shape;

public class Square implements Shape {

    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow(getLength(), 2);
    }
}
