package main.solid.interfacesegregation;

import main.solid.interfacesegregation.model.Cube;
import main.solid.singleresponsibility.ShapesPrinter;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Application {

    private static final Logger logger = Logger.getLogger("SRP Logger");

    public static void main(String[] args) {
        Cube cube = new Cube();

        // calculate the sum
        SumOfShapes sumOfShapes = new SumOfShapes();
        List<ThreeDimensionShape> shapes = List.of(cube);
        int sum = sumOfShapes.sumVolume(shapes);

        // print out the sum
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        logger.log(Level.INFO, "Json {0}", shapesPrinter.printJson(sum));
        logger.log(Level.INFO, "CSV {0}", shapesPrinter.printCsv(sum));
    }
}
