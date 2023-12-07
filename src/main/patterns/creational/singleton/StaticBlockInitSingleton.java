package main.patterns.creational.singleton;

public class StaticBlockInitSingleton {
    private static StaticBlockInitSingleton instance;

    private StaticBlockInitSingleton() {}

    // static block initialization for exception handling its very similar to eager init expect it can manage exception handling
    static {
        try {
            instance = new StaticBlockInitSingleton();
        } catch (Exception ex) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockInitSingleton getInstance() {
        return instance;
    }
}

/*
    Both eager initialization and static block initialization
    create the instance even before it’s being used and that is not the best practice to use.
 */
