package de.tum.cit.ase;

import java.util.List;

public class SpaceHall {
    private String name;
    private int capacity;
    private int rows;
    private Cadet[][] rowsOfCadets;

    public SpaceHall(String name, int capacity) {
        this.name = name;
        if (capacity <= 90) {
            this.capacity = 90;
            this.rows = 3; // Set rows to 3 when capacity is 90 or less
        } else {
            this.capacity = capacity - (capacity % 30); // Round down to nearest multiple of 30
            this.rows = this.capacity / 30;
        }
        this.rowsOfCadets = new Cadet[rows][30];
    }

    public void placeCadets(List<Cadet> waitingCadets) {
        // Print the number of waiting cadets
        System.out.println("Waiting cadets: " + waitingCadets.size());

        // Check if the number of cadets exceeds the capacity
        if (waitingCadets.size() > capacity) {
            System.out.println(name + " doesn't have enough places for all the cadets!");
            System.out.println("We can place only the first " + capacity + " out of " + waitingCadets.size() + " cadets.");
        }

        // Initialize the index to keep track of how many cadets have been placed
        int index = 0;

        // Iterate through the rows and place cadets
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 30; j++) {
                // If we have cadets to place and have not exceeded capacity
                if (index < waitingCadets.size() && index < capacity) {
                    rowsOfCadets[i][j] = waitingCadets.get(index++);
                } else {
                    // Once we reach the capacity, stop placing cadets
                    System.out.println("All cadets are positioned in the training hall.");
                    return;
                }
            }
        }
    }



    public void empty() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 30; j++) {
                rowsOfCadets[i][j] = null;
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + ":\n");
        for (int i = 0; i < rows; i++) {
            sb.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < 30; j++) {
                if (rowsOfCadets[i][j] == null) {
                    sb.append("[]");
                } else {
                    sb.append("[").append(rowsOfCadets[i][j].getFirstName()).append(" ").append(rowsOfCadets[i][j].getLastName()).append("]");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}


