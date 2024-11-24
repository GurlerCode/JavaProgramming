package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.List;

public class TrainingSession {
    private String id;
    private String sessionName;
    private Commander commander;
    private List<Cadet> cadets;
    private SpaceHall spaceHall;

    public TrainingSession(String id, String sessionName, Commander commander, SpaceHall spaceHall) {
        this.id = id;
        this.sessionName = sessionName;
        this.commander = commander;
        this.spaceHall = spaceHall;
        this.cadets = new ArrayList<>();
    }

    public String getSessionName() {
        return sessionName;
    }

    public Commander getCommander() {
        return commander;
    }

    public void addParticipant(Participant p) {
        if (p instanceof Commander) {
            if (this.commander == null) {
                this.commander = (Commander) p;
            } else {
                System.out.println("This training session already has a commander!");
            }
        } else if (p instanceof Cadet) {
            if (!cadets.contains(p)) {
                cadets.add((Cadet) p);
            } else {
                System.out.println(p.getLastName() + " spaceID:" + p.getSpaceID() + " already attends the training session.");
            }
        }
    }

    public void addParticipants(List<Participant> participants) {
        for (Participant participant : participants) {
            addParticipant(participant);
        }
    }

    public void takePlace() {
        spaceHall.placeCadets(cadets);
        commander.openSession(this);
        commander.closeSession(this);
        spaceHall.empty();
    }
}


