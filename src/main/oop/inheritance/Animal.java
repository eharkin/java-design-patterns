package main.oop.inheritance;

// inheritance meaning you can inherit the properties from the base class
// any class you derive the properties from is called SuperClass

/*
    Inheritance helps in code resuseability
    Inheritance can save time and effort as the main code need not be written again.
    Inheritance provides a clear model structure which is easy to understand.
    An inheritance leads to less development and maintenance costs.
 */
public class Animal {
    String name;
    int age;

    public void makeNoise() {
        System.out.println("Animal");
    }

    public void printName() {
        System.out.println(age + name);
    }
}
