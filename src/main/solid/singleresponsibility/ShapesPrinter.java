package main.solid.singleresponsibility;


// We need to a new Class for Printing Purposes to avoid SRP violation
public class ShapesPrinter {
    // now we violate SRP has only one sole purpose for a particular class and can't have excessive functionality
    // as we now have another responsiblility which is to print.
    public String printJson(int sum) {
        return "{sum: %s}".formatted(sum);
    }

    public String printCsv(int sum) {
        return "sum, %s".formatted(sum);
    }
}
