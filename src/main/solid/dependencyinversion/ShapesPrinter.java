package main.solid.dependencyinversion;


import java.util.List;

// We need to a new Class for Printing Purposes to avoid SRP violation
public class ShapesPrinter {

    // we are violating Dependency Inversion as we are using the concrete class intead of the abstract class
    // we are also violating open closed as we are opeining modification which not allowed.
    // SumOfShapes sumOfShapes = new SumOfShapes();

    // we use abstract instead of concrete class
    private final ISumOfShapes iSumOfShapes;

    public ShapesPrinter(ISumOfShapes iSumOfShapes) {
        this.iSumOfShapes = iSumOfShapes;
    }

    public String printJson(List<Shape> shapes) {
        return "{sum: %s}".formatted(iSumOfShapes.sum(shapes));
    }

    public String printCsv(List<Shape> shapes) {
        return "sum, %s".formatted(iSumOfShapes.sum(shapes));
    }
}
