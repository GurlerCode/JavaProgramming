package de.tum.cit.ase;

public class SealCitizen {
    private String name;
    private String telegraphCode;
    private Deed[] deedHistory;

    public SealCitizen(String name, String telegraphCode, Deed[] deedHistory) {
        this.name = name;
        this.telegraphCode = telegraphCode;
        this.deedHistory = deedHistory != null ? deedHistory : new Deed[0];  // Ensures non-null deedHistory
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelegraphCode() {
        return telegraphCode;
    }

    public void setTelegraphCode(String telegraphCode) {
        this.telegraphCode = telegraphCode;
    }

    public Deed[] getDeedHistory() {
        return deedHistory;
    }

    public void setDeedHistory(Deed[] deedHistory) {
        this.deedHistory = deedHistory;
    }

    public void printDeedHistory() {
        for (int i = 0; i < deedHistory.length; i++) {
            System.out.println(deedHistory[i].toString());
        }
    }
}
