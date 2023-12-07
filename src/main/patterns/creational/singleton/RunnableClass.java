package main.patterns.creational.singleton;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + "Instance: " + LazyInitSingleton.getInstance());
    }

}
