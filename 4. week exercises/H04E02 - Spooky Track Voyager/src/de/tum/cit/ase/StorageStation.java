package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.List;

public class StorageStation {
    private List<TrainTrack> tracks;
    private int amountTracks;

    // Constructor
    public StorageStation(int amountTracks, int trackCapacity) {
        this.amountTracks = amountTracks;
        this.tracks = new ArrayList<>();
        for (int i = 0; i < amountTracks; i++) {
            tracks.add(new TrainTrack(trackCapacity)); // Add tracks with the given capacity
        }
    }

    // Getters and Setters
    public List<TrainTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<TrainTrack> tracks) {
        this.tracks = tracks;
    }

    public int getAmountTracks() {
        return amountTracks;
    }

    public void setAmountTracks(int amountTracks) {
        this.amountTracks = amountTracks;
    }

    // Add a new TrainTrack to the station
    public void addTrack(TrainTrack track) {
        tracks.add(track);
        amountTracks++;
    }

    // Find a GhostTrain by ID
    public int find(int id) {
        for (int i = 0; i < tracks.size(); i++) {
            int trackIndex = tracks.get(i).find(id);
            if (trackIndex != -1) {
                return i; // Return the track index
            }
        }
        return -1; // Return -1 if not found
    }

    // Add a GhostTrain to the track with the most free spots
    public TrainTrack arriveStation(GhostTrain train) {
        for (TrainTrack track : tracks) {
            if (track.push(train)) {
                return track; // Return the track where the train was added
            }
        }
        return null; // Return null if no track has space
    }

    // Remove a GhostTrain from the track with the least free spots
    public GhostTrain departStation() {
        TrainTrack trackToDepart = null;
        for (TrainTrack track : tracks) {
            if (trackToDepart == null || track.amountFreeSpots() < trackToDepart.amountFreeSpots()) {
                trackToDepart = track;
            }
        }
        if (trackToDepart != null) {
            return trackToDepart.pop(); // Depart the ghost train
        }
        return null; // Return null if no train can depart
    }
}
