package main.oop.polymorphism;

/*
What Is Compile-time Polymorphism? Compile-time polymorphism is obtained through method overloading.
The term method overloading allows us to have more than one method with the same name.
Since this process is executed during compile time, that's why it is known as Compile-Time Polymorphism.
 */
public class CompileTimePolyMorphism {

    // the same method name know as method overloading since this process happens during compliation kwown as compile time polymporhism
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // not based on return type it's based on the method signature data types
    public int add(double num1, double num2) {
        return (int) (num1 + num2);
    }

    // not based on return type it's based on the method signature data types
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // this will not compile as not based on return type both number of method signatures
    /*public double add(double num1, double num2) {
        return (int) (num1 + num2);
    } */
}
