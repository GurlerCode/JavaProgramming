package de.tum.cit.ase;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /*TODO 4: Test your work on previous tasks in this main class. Instantiate objects, and try out the
         * methods to make sure they work properly. Use System.out.println() to print out the return value from
         * relevant methods.
         */

        Date date = new Date();

        Deed deed1 = new Deed(date, "Ate up all the fish");
        Deed deed2 = new Deed(date, "Donated to charity");
        Deed deed3 = new Deed(date, "Helped a friend in need");

        Deed[] deedHistory1 = {deed1, deed2};
        Deed[] deedHistory2 = {deed3};

        SealCitizen citizen1 = new SealCitizen("Seal Sealovich", ".-^.^./-", deedHistory1);
        SealCitizen citizen2 = new SealCitizen("Seal Sealy", "-/.-^.^.", deedHistory2);

        CitizenRegistry registry = new CitizenRegistry(new SealCitizen[]{citizen1, citizen2});
        SheriffOffice office = new SheriffOffice(registry);

        office.checkHistoryWithCode("-./-/-^.");
        office.checkHistoryWithCode("........");
    }
}
