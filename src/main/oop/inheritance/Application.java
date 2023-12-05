package main.oop.inheritance;

public class Application {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.name = "Cat";
        cat.age = 30;
        cat.makeNoise();
        cat.printName();
    }
}
