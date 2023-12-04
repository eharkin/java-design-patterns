package main.solid.dependencyinversion;

import java.util.List;

public interface ISumOfShapes {
    // function/method which deals with the sum of shapes
    int sum(List<Shape> shapes);

    int sumVolume(List<ThreeDimensionShape> shapes);
}
