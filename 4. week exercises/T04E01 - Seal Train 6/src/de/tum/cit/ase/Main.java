package de.tum.cit.ase;

public class Main {

    /**
     * Main entry point for our program. Instantiates the ControlCenter, runs the daily simulation,
     * and evaluates the results.
     */
    public static void main(String[] args) {
        ControlCenter cs = new ControlCenter();
        cs.simulateDay();
        cs.evaluateDay();
    }
}
