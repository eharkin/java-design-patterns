package main.solid.interfacesegregation;

/*
The I  in SOLID stands for interface segregation,
and it simply means that larger interfaces should be split into smaller ones.
By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.
 */
public interface Shape {
    double area();
    // now as our interface shape is growing and fact is that square,
    // circle and rectangle aren't 3d shapes so don't require volume
    // so we need to create a new volume interface and select for only certain shapes
    //double volume();
}
