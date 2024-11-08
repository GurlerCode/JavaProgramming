package de.tum.cit.ase;

public class Candle {

    private double radius;
    private double height;
    private boolean burning;
    private static double maxHeight = 10.0;
    private static double maxRadius = 2.0;

    public Candle(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.burning = false;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isBurning() {
        return burning;
    }
    public void setBurning(boolean burning) {
        this.burning = burning;
    }

    public double calculateWeight(){
        double pi = 3.14;
        double waxDensity = 0.95;
        return pi * radius * radius * height * waxDensity;
    }

    public void light() {
        this.burning = true;
    }

    public static double calculateMaxWeight(){
        double pi = 3.14;
        double waxDensity = 0.95;
        return maxHeight * maxRadius * maxRadius * waxDensity * pi;
    }

}
