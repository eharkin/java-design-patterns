package main.solid.singleresponsibility;

import main.solid.model.Circle;
import main.solid.model.Square;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Application {

    private static final Logger logger = Logger.getLogger("SRP Logger");

    public static void main(String[] args) {
        // init the objects with 10 and 10 radius
        Circle circle = new Circle(30);
        Square square = new Square(10);

        // calculate the sum
        SumOfShapes sumOfShapes = new SumOfShapes();
        List<Object> shapes = List.of(circle, square);
        int circleSum = sumOfShapes.sum(shapes);

        // print out the sum
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        logger.log(Level.INFO, "JSON {0}", shapesPrinter.printJson(circleSum));
        logger.log(Level.INFO, "CSV {0}", shapesPrinter.printCsv(circleSum));
    }
}
