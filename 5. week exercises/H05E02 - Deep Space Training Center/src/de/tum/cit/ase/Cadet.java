package de.tum.cit.ase;

public class Cadet extends Participant {

    public Cadet(String firstName, String lastName, String spaceID) {
        super(firstName, lastName, spaceID);
    }

    @Override
    public void attend(TrainingSession trainingSession) {
        trainingSession.addParticipant(this); // Should work if addParticipant is correct.
    }
}
