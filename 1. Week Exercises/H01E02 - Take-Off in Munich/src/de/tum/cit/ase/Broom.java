package de.tum.cit.ase;

public class Broom {
    private Witch witch;
    private double avgVelocity;
    private double currentVelocity;

    public Broom(Witch witch, double averageVelocity, double currentVelocity) {
        this.avgVelocity = averageVelocity;
        this.currentVelocity = currentVelocity;
        this.witch = witch;
    }

    public void setCurrentVelocity(double newVelocity) {
        this.currentVelocity = newVelocity;
    }

    public double getCurrentVelocity() {
        return currentVelocity;
    }

    public void setAvgVelocity(double avgVelocity) {
        this.avgVelocity = avgVelocity;
    }

    public double getAvgVelocity() {
        return avgVelocity;
    }

    public void setWitch(Witch witch) {
        this.witch = witch;
    }

    public Witch getWitch() {
        return witch;
    }

    public double calculateMaxVelocity() {
        if (witch.isExperiencedBroomOperator()) {
            return avgVelocity * 1.5; // Multiply by 1.5 if witch is experienced
        } else {
            return avgVelocity;
        }
    }

    public double distanceBetweenCurrentAndAverage() {
        return currentVelocity - avgVelocity;
    }

    @Override
    public String toString() {
        return "Broom{" +
                "witch=" + witch +  // calls Witch's toString method
                ", avgVelocity=" + avgVelocity +
                ", currentVelocity=" + currentVelocity +
                '}';
    }
}