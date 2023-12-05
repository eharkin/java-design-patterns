package main.oop.abstraction;

// we have extended the class now and implmented
// we can extend and implement in the same class
// we can only extend one class and multiple implements
public class Cat extends Animal implements IAnimal {

    // this is known as method overriding -- runtime polymorphism
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void makeNoises() {
        System.out.println("Meows.......");
    }
}
