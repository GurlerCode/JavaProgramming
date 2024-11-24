package de.tum.cit.ase;

public class Square extends Rectangle {

    // Constructor that initializes side (both width and height are the same for a square)
    public Square(double side) {
        super(side, side); // Calls Rectangle's constructor with equal width and height
    }
}
