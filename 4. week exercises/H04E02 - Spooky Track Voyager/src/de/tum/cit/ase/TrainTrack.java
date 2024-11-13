package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.List;

public class TrainTrack {
    private int capacity;
    private int amountGhostTrains;
    private List<GhostTrain> stack;

    // Constructor
    public TrainTrack(int capacity) {
        this.capacity = capacity;
        this.amountGhostTrains = 0;
        this.stack = new ArrayList<>();
    }

    // Getters and Setters
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAmountGhostTrains() {
        return amountGhostTrains;
    }

    public void setAmountGhostTrains(int amountGhostTrains) {
        this.amountGhostTrains = amountGhostTrains;
    }

    public List<GhostTrain> getStack() {
        return stack;
    }

    public void setStack(List<GhostTrain> stack) {
        this.stack = stack;
    }

    // Calculate free spots
    public int amountFreeSpots() {
        return capacity - amountGhostTrains;
    }

    // Find a GhostTrain by ID
    public int find(int id) {
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i).getId() == id) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Remove a GhostTrain by ID
    public GhostTrain remove(int id) {
        int index = find(id);
        if (index != -1) {
            GhostTrain train = stack.remove(index);
            amountGhostTrains--;
            return train;
        }
        return null; // Return null if not found
    }

    // Add a new GhostTrain to the track
    public boolean push(GhostTrain train) {
        if (amountGhostTrains < capacity) {
            stack.add(train);
            amountGhostTrains++;
            return true; // Train added successfully
        }
        return false; // No space left
    }

    // Remove and return the last GhostTrain from the track
    public GhostTrain pop() {
        if (!stack.isEmpty()) {
            GhostTrain train = stack.remove(stack.size() - 1);
            amountGhostTrains--;
            return train; // Return the last train
        }
        return null; // Return null if track is empty
    }
}
