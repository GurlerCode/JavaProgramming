package de.tum.cit.ase;

public class Flight {
    private Broom broom;
    private String from;
    private String to;
    private double duration;

    public Flight(Broom broom, String from, String to,  double duration) {
        this.broom = broom;
        this.from = from;
        this.to = to;
        this.duration = duration;
    }

    public Broom getBroom() {
        return broom;
    }

    public void setBroom(Broom broom) {
        this.broom = broom;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getEstimatedDistance() {
        return broom.getAvgVelocity() * duration; // Distance = Velocity * Time
    }

    // Estimate time based on max velocity
    public double getEstimatedTimeWithMaxVelocity() {
        double maxVelocity = broom.calculateMaxVelocity();
        return getEstimatedDistance() / maxVelocity; // time = distance / velocity
    }

    @Override
    public String toString() {
        return "Flight{" +
                "broom=" + broom +  // calls Broom's toString method
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", duration=" + duration +
                '}';
    }
}
