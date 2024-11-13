package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Entrance {

    private @NonNull SealQueue queue;

    // Constructor: Initializes the queue
    public Entrance() {
        queue = new SealQueue();
    }

    // IsEmpty method: Checks if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // GetQueueLength method: Returns the length of the queue
    public int getQueueLength() {
        return queue.size();
    }

    // Enqueue method: Adds a seal to the queue
    public void enqueue(Seal seal) {
        queue.enqueue(seal);
    }

    // Dequeue method: Removes a seal from the queue and checks if they have a valid ticket
    public Seal dequeue() {
        Seal seal = queue.dequeue();
        if (seal != null) {
            if (seal.getTicket().isValid()) {
                System.out.println("Entry was allowed for: " + seal.getLastName());
            } else {
                System.out.println("Entry was not allowed for: " + seal.getLastName());
            }
        }
        return seal;
    }
}
