package main.oop.abstraction;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Cat";
        cat.age = 12;
        cat.printName();
        cat.makeNoise();
        cat.makeNoises();


        Cat cat2 = new Cat();
        cat2.name = "Cat";
        cat2.age = 15;
        cat2.printName();
        cat2.makeNoise();
        cat.makeNoises();
    }
}
