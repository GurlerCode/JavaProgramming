package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.checkerframework.checker.nullness.qual.NonNull;

/**
* This class represents the trains that are going to be used in our underground simulation.
*/
public class Train {
    
    private float failingChance;
    private @NonNull List<Boolean> history;

    /**
     * Constructor without parameters. Sets failing chance to 0.
     */
    public Train() {
        setFailingChance(0);
        history = new ArrayList<Boolean>();
    }

    /**
     * @param failingChance chance of the train not working whenever the drive method is called.
     */
    public Train(float failingChance) {
        setFailingChance(failingChance);
        history = new ArrayList<Boolean>();
    }

    /**
     * Method that has to be evoked whenever the train should drive to the next station.
     *
     * @return True if the train is working, false if not.
     */
    public boolean isOnLine() {
        Random random = new Random();
        boolean driving = random.nextFloat() > failingChance;
        history.add(driving);
        return driving;
    }

    /**
     * @return A value between 0 and 1, representing the probability of isOnLine() returning false
     */
    public float getFailingChance() {
        return failingChance;
    }

    /**
     * @param failingChance A value between 0 and 1, representing the probability of isOnLine() returning false
     */
    public void setFailingChance(float failingChance) {
        if (failingChance >= 0 && failingChance <= 1) {
            this.failingChance = failingChance;
        }
    }

    /**
     * @return A list of Booleans, containing all values isOnLine() returned so far.
     */
    public @NonNull List<Boolean> getHistory() {
        return history;
    }

    /**
     * @return Size of the List history.
     */
    public int getSizeOfList() {
        return history.size();
    }

    /**
     * Checks if the parameter i is in-bounds and if so returns the element
     *
     * @param i index of an element
     * @return Element at position given by the parameter i in the history list.
     */
    public boolean getElementOFList(int i) {
        if (i < 0 || i >= history.size()) {
            throw new IllegalArgumentException("i should not be out of bounds of the list");
        }
        return history.get(i);
    }
}