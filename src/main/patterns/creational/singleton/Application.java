package main.patterns.creational.singleton;

public class Application {

    public static void main(String[] args) {
       EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
       enumSingleton.setValue(5);
       System.out.println(enumSingleton.getValue());
    }
}
