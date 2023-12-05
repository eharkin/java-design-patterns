package main.oop.abstraction;

// An abstract class means that we cannot instinate the object abstract class
// but we can extend this class and the implementation class we are allowed to instate the object
// so you need to think why in this example would we need to call create an object called Animal if we are going to inherit the properties
public abstract class Animal {

    // class variables allows you to override the values for abstract class
    int age;
    String name;

    // same as abstract method we call and then we extend the abstract class for implementation
    public abstract void makeNoise();

    // abstract class allows concrete methods
    public void printName() {
        System.out.println("Age and Name" + age + name);
    }

}
