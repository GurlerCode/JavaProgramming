package de.tum.cit.ase;

public class InterrogationRoom {
    public static String betray = "Betray";        // Removed 'final' to match expected access modifiers
    public static String silent = "Silent";
    public static String offerDeal = "Offer deal";
    public static String aggressive = "Aggressive";
    private final Interrogator interrogator;

    public InterrogationRoom(Interrogator interrogator) {
        this.interrogator = interrogator;
    }

    public void interrogate(Seal ella, Seal jack) {
        if (ella.getChoice().equals(betray) && jack.getChoice().equals(betray)) {
            ella.setPrisonTime(2);
            jack.setPrisonTime(2);
        } else if (ella.getChoice().equals(betray) && jack.getChoice().equals(silent)) {
            ella.setPrisonTime(0);
            jack.setPrisonTime(3);
        } else if (ella.getChoice().equals(silent) && jack.getChoice().equals(betray)) {
            ella.setPrisonTime(3);
            jack.setPrisonTime(0);
        } else {
            ella.setPrisonTime(1);
            jack.setPrisonTime(1);
        }
    }

    public void interrogatorUsesTactics(Seal ella, Seal jack) {
        if (interrogator.getTactic().equals(offerDeal)) {
            if (ella.getChoice().equals(betray)) {
                ella.setPrisonTime(ella.getPrisonTime() - 1);
            }
            if (jack.getChoice().equals(betray)) {
                jack.setPrisonTime(jack.getPrisonTime() - 1);
            }
        } else if (interrogator.getTactic().equals(aggressive)) {
            if (ella.getChoice().equals(silent)) {
                ella.setPrisonTime(ella.getPrisonTime() + 1);
            }
            if (jack.getChoice().equals(silent)) {
                jack.setPrisonTime(jack.getPrisonTime() + 1);
            }
        }
    }
}
