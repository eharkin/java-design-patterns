package main.solid.dependencyinversion;

import java.util.List;

/*
Benefits of dependency inversion

The principle of dependency inversion refers to the decoupling of software modules.
This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.
 */
public class SumOfShapes implements ISumOfShapes {

    // function/method which deals with the sum of shapes
    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for(Shape shape : shapes) {
            // call the interface object
            sum += shape.area();
        }
        return sum;
    }

    @Override
    public int sumVolume(List<ThreeDimensionShape> shapes) {
        int sum = 0;
        for(ThreeDimensionShape shape : shapes) {
            // call the interface object
            sum += shape.volume();
        }
        return sum;
    }
}
