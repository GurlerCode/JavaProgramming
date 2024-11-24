package de.tum.cit.ase;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of a circle using the formula: pi * radius^2.
     *
     * @return The area of the circle.
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
