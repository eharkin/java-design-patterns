package main.kiss;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*

KISS stands for Keep It Simple, Stupid. This software design principle states that designs, solutions, systems, and products work best if they’re kept simple.

It means we should favor simplicity over complexity and avoid complexity as much as possible.

The reasons to follow the KISS principle in our code include the following:

    It makes our code easier to change and maintain in the future
    It makes code easier to read and understand by other developers
    Simple code is easier to test when doing automated testing (like unit testing, integration testing, and so on)

 */
public class Application {

    public static void main(String[] args) {
        List<Integer> radius = List.of(1,2,3,4,5,6);

        if(radius.contains(3)) {
            System.out.println("It Contains the number 3");
        }
    }
}
