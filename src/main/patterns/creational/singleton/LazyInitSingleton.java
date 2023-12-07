package main.patterns.creational.singleton;

public class LazyInitSingleton {

    private static LazyInitSingleton instance;

    private LazyInitSingleton() {}

    // we are only creating the instance object if instance object doesn't exist
    public static LazyInitSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }

    /*
        Lazy initialization method to implement the singleton pattern creates the instance in the global access method.
        Here is the sample code for creating the singleton class with this approach

        The preceding implementation works fine in the case of the single-threaded environment,
        but when it comes to multi-threaded systems,
        it can cause issues if multiple threads are inside the if condition at the same time.
        It will destroy the singleton pattern and both threads will get different instances of the singleton class.
        In the next section, we will see different ways to create a thread-safe singleton class.

     */

}
