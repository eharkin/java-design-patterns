package main.patterns.creational.singleton;

public class RunnableApplication {

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableClass());
        t1.start();

        Thread t2 = new Thread(new RunnableClass());;
        t2.start();
    }
}
