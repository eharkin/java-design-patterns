package main.patterns.creational.singleton;

public class EagerInitSingleton {

    // we use static because it gets loaded first during compilation process in java-virtual machine
    private static EagerInitSingleton instance = new EagerInitSingleton();

    // call a private constructor to create only one instance
    // if we create a public constructor then we are going to create more than one instance we want to restrict
    private EagerInitSingleton() {}

    public static EagerInitSingleton getInstance() {
        return instance;
    }
}
