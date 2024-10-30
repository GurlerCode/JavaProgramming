package de.tum.cit.ase;

public class SheriffOffice {
    private CitizenRegistry citizenRegistry;

    public SheriffOffice(CitizenRegistry citizenRegistry) {
        this.citizenRegistry = citizenRegistry;
    }

    public void checkHistoryWithCode(String code) {
        SealCitizen citizen = citizenRegistry.searchWithCode(code);
        if (citizen != null) {
            citizen.printDeedHistory();
        } else {
            System.out.println("No history");
        }
    }
}
