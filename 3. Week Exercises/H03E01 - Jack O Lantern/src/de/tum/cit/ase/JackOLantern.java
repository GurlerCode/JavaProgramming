package de.tum.cit.ase;

public class JackOLantern {

    private Pumpkin pumpkin;
    private Candle candle;
    private Ghost ghost ;

    public JackOLantern(Pumpkin pumpkin, Candle candle, Ghost ghost) {
        this.pumpkin = pumpkin;
        this.candle = candle;
        this.ghost  = ghost;

        // Calculate and update pumpkin weight
        pumpkin.calculateWeight();
        // Carve face based on ghost's temper
        pumpkin.carveFace(this.ghost.getTemper());
    }

    public Pumpkin getPumpkin() {
        return pumpkin;
    }
    public void setPumpkin(Pumpkin pumpkin) {
        this.pumpkin = pumpkin;
    }

    public Candle getCandle() {
        return candle;
    }
    public void setCandle(Candle candle) {
        this.candle = candle;
    }

    public Ghost getGhost() {
        return ghost;
    }
    public void setGhost(Ghost ghost) {
        this.ghost = ghost;
    }

    public double calculateLanternWeight(){
        return pumpkin.getWeight() + candle.calculateWeight() + ghost.calculateWeight();
    }

    public static double calculateMaxLanternWeight(){
        return Pumpkin.calculateMaxWeight() + Candle.calculateMaxWeight() + Ghost.calculateMaxWeight();
    }

    public double hauntedLantern(){
        candle.light();
        return ghost.scarePower();
    }

}
