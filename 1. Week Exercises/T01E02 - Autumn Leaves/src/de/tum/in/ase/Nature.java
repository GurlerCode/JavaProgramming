package de.tum.in.ase;

public class Nature {

    // TODO 23: Declare the Sky attribute "sky"
    private Sky sky;

    // TODO 24: Declare and define the constructor for the class Nature with the Sky parameter "sky"
    public Nature(Sky sky) {
        this.sky = sky;
    }

    // TODO 25: Declare and define the getter mehod for the Sky attribute "sky"
    public Sky getSky() {
        return sky;
    }

    // TODO 26: Declare and define the setter mehod for the Sky attribute "sky"
    public void setSky(Sky sky) {
        this.sky = sky;
    }

    // TODO 27: Declare and define the method "toString" with no parameters
    @Override
    public String toString() {
        return sky.toString(); // Delegates to Sky's toString method
    }

    // TODO 28: Declare and define the method "bringAutumn" with no parameters
    public void bringAutumn() {
        sky.changeTemperature(-10); // Decrease temperature by 10 degrees
        sky.rain(50);               // Call rain with 50 units
    }

    // TODO 29: Declare and define the method "bringSpring" with no parameters
    public void bringSpring() {
        sky.changeTemperature(10);  // Increase temperature by 10 degrees
        sky.createWind();           // Create wind
    }
}