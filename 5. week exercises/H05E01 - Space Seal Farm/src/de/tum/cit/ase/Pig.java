package de.tum.cit.ase;

// Pig Class
public class Pig extends Animal implements Rideable {

    public Pig(String name) {
        super(name);
    }

    @Override
    public String messageOnFeed() {
        return "Oink!";
    }

    @Override
    public String messageOnRide() {
        return "Riding on Pig " + getName();
    }
}
