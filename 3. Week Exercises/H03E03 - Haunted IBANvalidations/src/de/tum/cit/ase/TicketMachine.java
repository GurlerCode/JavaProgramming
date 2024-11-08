package de.tum.cit.ase;

import java.math.BigInteger;

public class TicketMachine {
    private static final int PRICE = 10; // Correct modifier for PRICE
    private static int ticketsSoldCount = 0;
    private static final BigInteger BLACKLISTED_IBAN = new BigInteger("27100777770209299700");

    public static boolean processPaymentMethod(BigInteger accountNumber) {
        BigInteger generatedIBAN = IBANValidator.generateIBAN(accountNumber);

        if (!ibanIsBlacklisted(generatedIBAN) && IBANValidator.validateIBAN(generatedIBAN)) {
            ticketsSoldCount++; // Increment ticketsSoldCount correctly
            return true;
        }
        return false;
    }

    public static int getTotalRevenue() {
        return ticketsSoldCount * PRICE;
    }

    public static boolean ibanIsBlacklisted(BigInteger iban) {
        return iban.equals(BLACKLISTED_IBAN);
    }
}
