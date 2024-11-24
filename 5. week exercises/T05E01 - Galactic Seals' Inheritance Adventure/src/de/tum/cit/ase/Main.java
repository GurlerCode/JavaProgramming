package de.tum.cit.ase;

public class Main {
    public static void main(String[] args) {
        // TODO 3: Test your implementation

        StarSeal moondancer = new StarSeal("Moondancer");
        MeteorSeal moonwalker = new MeteorSeal("Moonwalker", 50);
        moondancer.eat();
        moonwalker.teleport();

    }
}
