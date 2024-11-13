package de.tum.cit.ase;

public class Contact {
    private String name;
    private String phoneNumber;
    private boolean isSealDeputy;

    // Constructor
    public Contact(String name, String phoneNumber, boolean isSealDeputy) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isSealDeputy = isSealDeputy;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean getIsSealDeputy() {
        return isSealDeputy;
    }

    public void setIsSealDeputy(boolean isSealDeputy) {
        this.isSealDeputy = isSealDeputy;
    }

    // Custom toString method
    @Override
    public String toString() {
        String team = isSealDeputy ? "Seal Sheriff Squad" : "Ghost Riders";
        return name + " can be reached at " + phoneNumber + " and is part of the " + team;
    }
}