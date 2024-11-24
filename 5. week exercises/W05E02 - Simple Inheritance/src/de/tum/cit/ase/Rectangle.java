package de.tum.cit.ase;

public class Rectangle extends Shape {

    private double width;
    private double height;

    // Constructor that initializes width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override area method to calculate area of rectangle
    @Override
    public double area() {
        return width * height;
    }
}
