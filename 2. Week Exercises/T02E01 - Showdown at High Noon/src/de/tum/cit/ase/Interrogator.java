package de.tum.cit.ase;

public class Interrogator {
    private String name;
    private String tactic;

    public Interrogator(String name) {
        this.name = name;
        this.tactic = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {  // Setter for 'name'
        this.name = name;
    }

    public String getTactic() {
        return tactic;
    }

    public void setTactic(String tactic) {
        this.tactic = tactic;
    }
}
