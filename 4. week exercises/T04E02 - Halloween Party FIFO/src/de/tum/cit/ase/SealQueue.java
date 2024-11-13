package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;
import java.util.List;

public class SealQueue {

    private @NonNull List<Seal> queue;

    // Constructor
    public SealQueue() {
        queue = new ArrayList<>();
    }

    // Enqueue method: Adds a seal to the end of the queue
    public void enqueue(@NonNull Seal seal) {
        queue.add(seal);
    }

    // Dequeue method: Removes the seal at the front of the queue
    public Seal dequeue() {
        if (isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    // Size method: Returns the size of the queue
    public int size() {
        return queue.size();
    }

    // IsEmpty method: Checks if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // RollCall method: Prints all the names of seals in the queue
    public void rollCall() {
        for (Seal seal : queue) {
            System.out.println(seal.getLastName());
        }
    }

    // CleanQueue method: Clears the queue
    public void cleanQueue() {
        while (!isEmpty()) {
            dequeue(); // This will remove all seals from the queue
        }
    }
}
