package de.tum.cit.ase;

public class Main {

    public static void main(String[] args) {

        // Create a few ticket objects
        Ticket validTicket = new Ticket(true);
        Ticket invalidTicket = new Ticket(false);

        // Create a few seal objects
        Seal seal1 = new Seal(25, "Apple", validTicket, false);
        Seal seal2 = new Seal(30, "Orange", invalidTicket, false);
        Seal seal3 = new Seal(22, "Banana", validTicket, false);
        Seal seal4 = new Seal(35, "Grapes", invalidTicket, true);

        // Create an Entrance object
        Entrance entrance = new Entrance();

        // Enqueue all seals
        entrance.enqueue(seal1);
        entrance.enqueue(seal2);
        entrance.enqueue(seal3);
        entrance.enqueue(seal4);

        // Dequeue all seals and check entry
        while (!entrance.isEmpty()) {
            entrance.dequeue();
        }
    }
}
