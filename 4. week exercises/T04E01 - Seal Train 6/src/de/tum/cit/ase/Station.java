package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Station {
    // Corrected access modifier for 'name'
    private String name;
    private Station nextStationToGarching;
    private Station nextStationToGrosshadern;
    private final List<Train> toGarching;
    private final List<Train> toGrosshadern;

    // Terminal station names
    private static final @NonNull String TERMINAL_STATION1 = "Garching-Forschungszentrum";
    private static final @NonNull String TERMINAL_STATION2 = "Klinikum Grosshadern";

    public Station(@NonNull String name, @Nullable Station nextStationToGarching,
                   @Nullable Station nextStationToGrosshadern) {
        this.name = name;
        this.nextStationToGarching = nextStationToGarching;
        this.nextStationToGrosshadern = nextStationToGrosshadern;
        this.toGarching = new ArrayList<>();
        this.toGrosshadern = new ArrayList<>();
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    // Methods to add trains to lists
    public void addTrainToGrosshadern(@NonNull Train train) {
        toGrosshadern.add(train);
    }

    public void addTrainToGarching(@NonNull Train train) {
        toGarching.add(train);
    }

    // Dispatch method for trains to Garching
    public void dispatchTrainsToGarching() {
        if (!toGarching.isEmpty()) {
            Train train = toGarching.get(0);
            if (train.isOnLine()) {
                toGarching.remove(0);
                if (TERMINAL_STATION1.equals(name)) {
                    // Re-add to the opposite direction at terminal
                    addTrainToGrosshadern(train);
                } else if (nextStationToGarching != null) {
                    nextStationToGarching.addTrainToGrosshadern(train);
                }
            }
        }
    }

    // Dispatch method for trains to Grosshadern
    public void dispatchTrainsToGrosshadern() {
        if (!toGrosshadern.isEmpty()) {
            Train train = toGrosshadern.get(0);
            if (train.isOnLine()) {
                toGrosshadern.remove(0);
                if (TERMINAL_STATION2.equals(name)) {
                    // Re-add to the opposite direction at terminal
                    addTrainToGarching(train);
                } else if (nextStationToGrosshadern != null) {
                    nextStationToGrosshadern.addTrainToGarching(train);
                }
            }
        }
    }


    // Remove and return the first train from the waiting list to Grosshadern
    public @Nullable Train removeTrainToGrosshadern() {
        if (toGrosshadern.isEmpty()) {
            return null;
        }
        return toGrosshadern.remove(0);
    }

    // Remove and return the first train from the waiting list to Garching
    public @Nullable Train removeTrainToGarching() {
        if (toGarching.isEmpty()) {
            return null;
        }
        return toGarching.remove(0);
    }

    // Return the length of the waiting list to Garching
    public int getLengthOfWaitingListToGarching() {
        return toGarching.size();
    }

    // Return the length of the waiting list to Grosshadern
    public int getLengthOfWaitingListToGrosshadern() {
        return toGrosshadern.size();
    }

    // Getter and setter for nextStationToGarching
    public @Nullable Station getNextStationToGarching() {
        return nextStationToGarching;
    }

    public void setNextStationToGarching(@Nullable Station nextStationToGarching) {
        this.nextStationToGarching = nextStationToGarching;
    }

    // Getter and setter for nextStationToGrosshadern
    public @Nullable Station getNextStationToGrosshadern() {
        return nextStationToGrosshadern;
    }

    public void setNextStationToGrosshadern(@Nullable Station nextStationToGrosshadern) {
        this.nextStationToGrosshadern = nextStationToGrosshadern;
    }

    // Getter for toGrosshadern
    public @NonNull List<Train> getToGrosshadern() {
        return toGrosshadern;
    }

    // Getter for toGarching
    public @NonNull List<Train> getToGarching() {
        return toGarching;
    }

    // Setter for toGrosshadern list (clears current list and adds new trains)
    public void setToGrosshadern(@NonNull List<Train> trains) {
        this.toGrosshadern.clear();
        this.toGrosshadern.addAll(trains);
    }

    // Setter for toGarching list (as required by test case)
    public void setToGarching(@NonNull List<Train> trains) {
        this.toGarching.clear();
        this.toGarching.addAll(trains);
    }

    // Getter for the station's name
    public @NonNull String getName() {
        return name;
    }
}
