package main.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoClass {


    public static void main(String[] myArgs) {

        myArgs = new String[]{"1", "2", "3"};

        for(String s : myArgs) {
            System.out.println(s);
        }

        int t = 15;
       double d = t; // widen casting (automatic) smaller to largest
        System.out.println(d);

        double e = 22.0;
        int f = (int) e; // narrow casting (manual) largest to smallest
        System.out.println(f);

        int a = Math.max(5,Integer.MAX_VALUE);
        int b = Math.min(4, Integer.MAX_VALUE);
        double x = Math.sqrt(64);
        int c = Math.abs(-5);
        int randomNum = (int) (Math.random() * 50);

        System.out.println(randomNum);

        switch(a) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Default");
        }

        int h = 0;
        do {
            System.out.println(h);
            h++;
        } while (h < 6);

        for (int i = 1; i <= 2; ++i) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; ++j) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        String[] car = {"Car", "Mazada"};

        String[] car2 = new String[]{};

        List<String> car3 = new LinkedList<>();

        car3.add("Car");
        car3.add("Car2");


        int[][][] myNumbers = {{{1, 2, 3, 4}, {5, 6, 7}, {8,9,10}}};
        System.out.println(myNumbers[0][2][0]);
        // 1,2,3,4
        // 5,6,7
        // 8,9,10
    }
}
