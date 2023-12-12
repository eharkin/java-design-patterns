package main.practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {

    public String reverseSentence(String s) {
       List<String> as = new ArrayList<>(List.of(s.split(" ")));
       Collections.reverse(as);
       return String.join(" ", as);
    }

    public void reverseSentences(String s) {
        List<String> as2 = new ArrayList<>(List.of(s.split(" ")));
        Collections.reverse(as2);

        Iterator iterator = as2.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
       String s = "good am i";
       Demo mn = new Demo();
       //String reverse = mn.reverseSentence(s);
       mn.reverseSentences(s);
       //System.out.println(reverse);
    }
}
