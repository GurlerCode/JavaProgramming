package de.tum.cit.ase;

public abstract class Participant {
    private String firstName;
    private String lastName;
    private String spaceID;

    public Participant(String firstName, String lastName, String spaceID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.spaceID = spaceID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpaceID() {
        return spaceID;
    }

    public abstract void attend(TrainingSession trainingSession);
}
