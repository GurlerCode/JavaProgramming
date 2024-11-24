package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.List;

public class Commander extends Participant {
    private String rank;
    private List<TrainingSession> trainingSessions;

    public Commander(String firstName, String lastName, String spaceID, String rank) {
        super(firstName, lastName, spaceID);
        this.rank = rank;
        this.trainingSessions = new ArrayList<>();
    }

    @Override
    public void attend(TrainingSession trainingSession) {
        if (trainingSession.getCommander() != null && !trainingSession.getCommander().getSpaceID().equals(this.getSpaceID())) {
            trainingSession.addParticipant(this);
        } else {
            System.out.println(getLastName() + " spaceID:" + getSpaceID() + " already attends/leads the training session.");
        }
    }


    public void openSession(TrainingSession trainingSession) {
        System.out.println("Welcome to Training Session " + trainingSession.getSessionName() + "! I'm " + rank + " " + getLastName() + ".");
    }

    public void closeSession(TrainingSession trainingSession) {
        System.out.println("Training complete. Remember, in space, precision is survival.");
    }

    public List<TrainingSession> getTrainingSessions() {
        return trainingSessions;
    }

    public void addSession(TrainingSession trainingSession) {
        if (trainingSession.getCommander() == null || trainingSession.getCommander().getSpaceID().equals(this.getSpaceID())) {
            trainingSessions.add(trainingSession);
        } else {
            System.out.println("Training session " + trainingSession.getSessionName() + " is already assigned to another commander.");
        }
    }

    @Override
    public String toString() {
        return rank + " " + getLastName();
    }
}
