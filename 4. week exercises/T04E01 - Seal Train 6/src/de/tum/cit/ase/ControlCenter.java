package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The ControlCenter class is responsible for managing and simulating subway traffic.
 * It initializes stations and manages the trains in the system's depot, facilitating
 * train dispatch and simulating daily operations.
 */
public class ControlCenter {

    private @NonNull Depot depotFroettmannig;
    private @NonNull List<Station> stations;
    private @NonNull List<Train> trains;
    private int steps;

    /**
     * Constructs a ControlCenter with a specified list of trains, initializing the U6 line
     * and adding the given trains to the depot.
     *
     * @param trains A list of trains to be added to the depot
     */
    public ControlCenter(@NonNull List<Train> trains) {
        depotFroettmannig = new Depot();
        this.trains = trains;
        for (Train train : this.trains) {
            depotFroettmannig.addTrain(train);
        }
        this.stations = new ArrayList<>();
        setUpStations();
    }

    /**
     * Constructs a ControlCenter with an empty depot, initializing a simplified U6 line
     * and adding 10 default trains to the depot.
     */
    public ControlCenter() {
        depotFroettmannig = new Depot();
        trains = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Train train = new Train(0.5f);
            trains.add(train);
            depotFroettmannig.addTrain(train);
        }
        this.stations = new ArrayList<>();
        setUpStations();
    }

    /**
     * Sets up the stations for the U6 line in sequence, connecting each station to its next.
     * Creates a route from "Garching Forschungszentrum" to "Klinikum Großhadern."
     */
    private void setUpStations() {
        Station garching = new Station("Garching Forschungszentrum", null, null);
        Station froettmanning = new Station("Fröttmaning", garching, null);
        garching.setNextStationToGrosshadern(froettmanning);
        Station kieferngarten = new Station("Kieferngarten", froettmanning, null);
        froettmanning.setNextStationToGrosshadern(kieferngarten);
        Station studentenstadt = new Station("Studentenstadt", kieferngarten, null);
        kieferngarten.setNextStationToGrosshadern(studentenstadt);
        Station freiheit = new Station("Münchner Freiheit", studentenstadt, null);
        studentenstadt.setNextStationToGrosshadern(freiheit);
        Station marienplatz = new Station("Marienplatz", freiheit, null);
        freiheit.setNextStationToGrosshadern(marienplatz);
        Station westpark = new Station("Westpark", marienplatz, null);
        marienplatz.setNextStationToGrosshadern(westpark);
        Station grosshadern = new Station("Klinikum Großhadern", westpark, null);
        westpark.setNextStationToGrosshadern(grosshadern);

        stations = Arrays.asList(garching, froettmanning, kieferngarten, studentenstadt, freiheit, marienplatz,
                westpark, grosshadern);
    }

    /**
     * Simulates a full day of subway traffic. It dispatches trains from the depot, moves them
     * between stations, and eventually returns them to the depot at the end of the day.
     */
    public void simulateDay() {
        for (int i = 0; i < 48; i++) {
            if (!depotFroettmannig.isEmpty()) {
                Train train = depotFroettmannig.getNextTrain();
                if (train != null) {
                    stations.get(1).addTrainToGrosshadern(train);
                }
            }
            callDispatch();
            System.out.print(i + ": ");
            printCurrentState();
        }
        steps = 48;
        while (depotFroettmannig.numberOfTrains() < 10 && depotFroettmannig.numberOfTrains() > 0) {
            System.out.print(steps + ": ");
            printCurrentState();
            steps++;
            Train train = stations.get(1).removeTrainToGrosshadern();
            if (train != null) {
                depotFroettmannig.addTrain(train);
            }
            callDispatch();
        }
    }

    /**
     * Iterates through all stations and dispatches trains to their respective destinations.
     * Ensures that trains are directed correctly along the route.
     */
    private void callDispatch() {
        List<Station> nonEmptyStationsToGarching = new ArrayList<>();
        List<Station> nonEmptyStationsToGrosshadern = new ArrayList<>();

        for (Station station : stations) {
            if (!station.getToGarching().isEmpty()) {
                nonEmptyStationsToGarching.add(station);
            }
        }

        for (Station station : stations) {
            if (!station.getToGrosshadern().isEmpty()) {
                nonEmptyStationsToGrosshadern.add(station);
            }
        }

        for (Station station : stations) {
            if (nonEmptyStationsToGarching.contains(station)) {
                station.dispatchTrainsToGarching();
            }
            if (nonEmptyStationsToGrosshadern.contains(station)) {
                station.dispatchTrainsToGrosshadern();
            }
        }
    }

    /**
     * Prints the current state of the stations, showing the number of trains moving toward each destination.
     * Useful for tracking train movement during simulation.
     */
    private void printCurrentState() {
        for(Station s : this.stations){
            System.out.print(s.getToGrosshadern().size() + "/" + s.getToGarching().size() + " ");
        }
        System.out.println(" ");
    }

    /**
     * Evaluates and prints summary statistics for the simulated day, including the total
     * number of train movements, waiting times, and stations passed by each train.
     */
    public void evaluateDay() {
        int drove = 0;
        for (Train train : trains) {
            drove += train.getHistory().size();
        }
        System.out.println("All train actions: " + (steps * 10) + ", waited: " + ((steps * 10) - drove) +
                ", driven: " + drove);
        System.out.println("A train passed on average " + (drove / 10) + " stations.");
        System.out.println("A train waited on average " + ((480 - drove) / 10) + " times.");
    }
}