package de.tum.cit.ase;

public class Seal {
    private String name;
    private String choice;
    private int prisonTime;

    public Seal(String name) {
        this.name = name;
        this.choice = null;
        this.prisonTime = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {  // Setter for 'name'
        this.name = name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public int getPrisonTime() {
        return prisonTime;
    }

    public void setPrisonTime(int prisonTime) {
        this.prisonTime = prisonTime;
    }
}
