package de.tum.cit.ase;

public class Main {

    public static void main(String[] args) {
        // Testing Rectangle
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Rectangle area: " + rectangle.area());

        // Testing Square
        Square square = new Square(5);
        System.out.println("Square area: " + square.area());

        // Testing Circle
        Circle circle = new Circle(3);
        System.out.println("Circle area: " + circle.area());

        // Setting color for Circle
        circle.color = "Red";
        System.out.println("Circle's color: " + circle.color);
    }
}
