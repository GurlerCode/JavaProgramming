package de.tum.cit.ase;

public class Shape {

    // The keyword protected means that the variable color can be accessed directly
    // from this class itself, any class in the same package, and also
    // from any subclass, irrespective of the package
    protected String color;

    public double area() {
        return 0.0;
    }

}
