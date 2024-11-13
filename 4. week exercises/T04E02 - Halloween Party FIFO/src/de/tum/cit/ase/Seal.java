package de.tum.cit.ase;

public class Seal {

    // Define the variables
    private int age;
    private String lastName;
    private Ticket ticket;
    private boolean organizer;

    // Constructor
    public Seal(int age, String lastName, Ticket ticket, boolean organizer) {
        this.age = age;
        this.lastName = lastName;
        this.ticket = ticket;
        this.organizer = organizer;
    }

    // Getter and setter methods
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean isOrganizer() {
        return organizer;
    }

    public void setOrganizer(boolean organizer) {
        this.organizer = organizer;
    }
}
