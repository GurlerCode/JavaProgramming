package de.tum.cit.ase;

public class CitizenRegistry {
    private SealCitizen[] citizens;

    public CitizenRegistry(SealCitizen[] citizens) {
        this.citizens = citizens;
    }

    private static boolean areCorrespondingSymbols(char a, char b) {
        return (a == '.' && b == '-') || (a == '-' && b == '.')
                || (a == '^' && b == '/') || (a == '/' && b == '^');
    }

    private static boolean checkCodes(String code1, String code2) {
        if (code1.length() != code2.length()) {
            return false;
        }

        for (int i = 0; i < code1.length(); i++) {
            if (!areCorrespondingSymbols(code1.charAt(i), code2.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public SealCitizen searchWithCode(String code) {
        for (SealCitizen citizen : citizens) {
            if (checkCodes(citizen.getTelegraphCode(), code)) {
                return citizen;
            }
        }
        return null;
    }
}
