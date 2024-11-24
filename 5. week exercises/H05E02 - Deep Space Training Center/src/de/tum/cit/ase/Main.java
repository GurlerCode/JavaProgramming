package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO test your code here
        // Commander krusche = new Commander("Professor", "Stephan", "Krusche", "General");

        // SpaceHall interimsII = new SpaceHall("Interims II", 380);
        // SpaceHall friedrichLBauer = new SpaceHall("Friedrich L. Bauer", 522);
        // SpaceHall audimaxGalileo = new SpaceHall("Audimax im Galileo", 1236);

        // TrainingSession itp = new TrainingSession("CIT5230000", "Introduction to Programming", krusche, interimsII);
        // TrainingSession pse = new TrainingSession("IN2081", "Patterns in Software Engineering", krusche,
        //         friedrichLBauer);
        // TrainingSession eist = new TrainingSession("IN0006", "Einführung in die Softwaretechnik", krusche,
        //         audimaxGalileo);
        // krusche.addSession(itp);
        // krusche.addSession(pse);
        // krusche.addSession(eist);
        // List<Participant> participantsITP = new LinkedList<>();
        // participantsITP.add(krusche);
        // participantsITP.addAll(generateCadets(737));
        // itp.addParticipants(participantsITP);
        // itp.takePlace();
    }

    // TODO Part 4.1: Implement the generateCadets method
    public static List<Cadet> generateCadets(int amount) {
        List<Cadet> cadets = new ArrayList<>();
        for (int i = 1; i <= amount; i++) {
            cadets.add(new Cadet("Cadet" + i, "Last" + i, "ID" + i));
        }
        return cadets;
    }
}
