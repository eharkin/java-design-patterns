package main.solid.interfacesegregation;

import main.solid.model.Circle;
import main.solid.model.Cube;
import main.solid.model.Square;

import java.util.List;

/*
Benefits of Open Closed

It’s now time for the O in SOLID, known as the open-closed principle.
Simply put, classes should be open for extension but closed for modification.
In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.
Of course, the one exception to the rule is when fixing bugs in existing code.
 */
public class SumOfShapes {

    // function/method which deals with the sum of shapes
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for(Shape shape : shapes) {
            // call the interface object
            sum += shape.area();
        }
        return sum;
    }

    public int sumVolume(List<ThreeDimensionShape> shapes) {
        int sum = 0;
        for(ThreeDimensionShape shape : shapes) {
            // call the interface object
            sum += shape.volume();
        }
        return sum;
    }
}
