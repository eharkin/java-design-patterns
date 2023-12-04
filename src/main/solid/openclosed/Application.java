package main.solid.openclosed;

import main.solid.model.Circle;
import main.solid.model.Cube;
import main.solid.model.Rectangle;
import main.solid.model.Square;
import main.solid.singleresponsibility.ShapesPrinter;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Application {

    private static final Logger logger = Logger.getLogger("SRP Logger");

    public static void main(String[] args) {
        // init the objects with 10 and 10 radius
        Circle circle = new Circle(50);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();

        // calculate the sum
        main.solid.openclosed.SumOfShapes sumOfShapes = new SumOfShapes();
        List<Shape> shapes = List.of(circle, square, cube, rectangle);
        int sum = sumOfShapes.sum(shapes);

        // print out the sum
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        logger.log(Level.INFO, "Json {0}", shapesPrinter.printJson(sum));
        logger.log(Level.INFO, "CSV {0}", shapesPrinter.printCsv(sum));
    }
}
