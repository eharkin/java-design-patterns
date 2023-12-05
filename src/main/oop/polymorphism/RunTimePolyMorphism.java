package main.oop.polymorphism;


/*
In runtime polymorphism, the compiler resolves the object at run time
and then it decides which function call should be associated with that object.
It is also known as dynamic or late binding polymorphism.
This type of polymorphism is executed through virtual functions and function overriding.
 */
public class RunTimePolyMorphism extends Animal {

    // now this will be late binding as the complier will only know once we call this function overriding method
    @Override
    public void makeNoise() {
        System.out.println("RunTime Polymorphism");
    }

    public static void main(String[] args) {
       RunTimePolyMorphism runTimePolyMorphism = new RunTimePolyMorphism();
       // complier only know we called the function that what its dynamic/late binding
       runTimePolyMorphism.makeNoise();
    }
}



