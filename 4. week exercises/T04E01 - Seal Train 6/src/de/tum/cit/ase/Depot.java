package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Depot {
    private List<Train> trains;

    public Depot() {
        this.trains = new ArrayList<>();
    }

    public Depot(@NonNull List<Train> trains) {
        this.trains = new ArrayList<>(trains);
    }

    public void addTrain(@NonNull Train train) {
        trains.add(train);
    }

    public boolean isEmpty() {
        return trains.isEmpty();
    }

    public int numberOfTrains() {
        return trains.size();
    }

    public @Nullable Train getNextTrain() {
        if (trains.isEmpty()) {
            return null;
        }
        return trains.remove(trains.size() - 1);
    }

    // Adding the buyTrains method
    public void buyTrains(int number) {
        for (int i = 0; i < number; i++) {
            trains.add(new Train());
        }
    }

    // Revised maintainTrains method to simulate train maintenance
    public void maintainTrains() {
        for (Train train : trains) {
            // Set a lower failing chance to simulate "maintenance"
            train.setFailingChance(0.1f);  // Assume maintenance reduces the failure rate to 10%
        }
    }
}
