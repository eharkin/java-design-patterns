package main.patterns.creational.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    // we are only creating the instance object if instance object doesn't exist
    // now this is thread safe as we added the synchronised keyword which only allows one thread at a time to access known as locking
    // this is known as double checking lock so we are improving the performance of singleton by not called synochized each thread if instance already exists
    public static ThreadSafeSingleton getInstance() {
        if(instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
