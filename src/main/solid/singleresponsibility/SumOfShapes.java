package main.solid.singleresponsibility;

import main.solid.model.Circle;
import main.solid.model.Square;

import java.util.List;

// Benefits of SRP

/*
Benefits of SRP

Testing – A class with one responsibility will have far fewer test cases.
Lower coupling – Less functionality in a single class will have fewer dependencies.
Organization – Smaller, well-organized classes are easier to search than monolithic ones.
 */
public class SumOfShapes {

    // function/method which deals with the sum of shapes
    public int sum(List<Object> shapes) {
        int sum = 0;
        for(Object shape : shapes) {
            if(shape instanceof Circle circle) {
                sum += Math.PI * Math.pow((circle).getRadius(), 2);
            }

            if(shape instanceof Square square) {
                sum += Math.pow((square).getLength(), 2);
            }
        }
        return sum;
    }

    // now we violate SRP has only one sole purpose for a particular class and can't have excessive functionality
    // as we now have another responsiblility which is to print.
    public String printJson(int sum) {
        return "{sum: %s}".formatted(sum);
    }

    public String printCsv(int sum) {
        return "sum, %s".formatted(sum);
    }
}
