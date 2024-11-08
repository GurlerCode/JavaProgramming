package de.tum.cit.ase;

import java.math.BigInteger;

public class IBANValidator {
    private static final BigInteger NINETY_SEVEN = BigInteger.valueOf(97);
    private static final BigInteger CHECKSUM_BASE = BigInteger.valueOf(131400);

    public static boolean checkLengthAndSignWhenValidating(BigInteger iban) {
        // Check that the IBAN has 20 digits and is non-negative
        return iban.compareTo(BigInteger.ZERO) > 0 && iban.toString().length() == 20;
    }

/*    public static boolean validateIBAN(BigInteger iban) {
        if (!checkLengthAndSignWhenValidating(iban)) return false;

        // Extract account number and checksum
        BigInteger accountNumber = iban.divide(BigInteger.valueOf(100));
        BigInteger checksum = iban.mod(BigInteger.valueOf(100));

        // Rearrange as per validation format: accountNumber + "1314" + checksum
        BigInteger rearrangedIBAN = accountNumber
                .multiply(BigInteger.valueOf(1000000)) // Shift account number for "1314" and checksum
                .add(CHECKSUM_BASE)                     // "DE" as "1314" and placeholder "00" for checksum
                .add(checksum);                         // Add actual checksum

        // Check if remainder when divided by 97 is 1
        return rearrangedIBAN.mod(NINETY_SEVEN).equals(BigInteger.ONE);
    }*/

    public static boolean validateIBAN(BigInteger iban) {
        if (!checkLengthAndSignWhenValidating(iban)) return false;

        // Rearrange IBAN by moving country code and checksum to the end
        String ibanStr = iban.toString();
        String rearrangedIban = ibanStr.substring(2) + ibanStr.substring(0, 2);

        // Convert rearranged IBAN to BigInteger for mod 97 operation
        BigInteger numericIban = new BigInteger(rearrangedIban);
        return numericIban.mod(NINETY_SEVEN).equals(BigInteger.ONE);
    }

    public static BigInteger generateIBAN(BigInteger accountNumber) {
        // Format account number to ensure it has 18 digits
        String accountNumberString = String.format("%018d", accountNumber);

        // Rearrange: account number + "1314" + placeholder checksum "00"
        BigInteger rearrangedIBAN = new BigInteger(accountNumberString + "131400");

        // Calculate checksum
        BigInteger remainder = rearrangedIBAN.mod(NINETY_SEVEN);
        BigInteger checksum = BigInteger.valueOf(98).subtract(remainder);

        // Combine checksum and account number for final IBAN
        /*return new BigInteger(checksum.toString() + accountNumberString);*/

        // Combine checksum and account number for final IBAN
        String ibanStr = String.format("%02d", checksum.intValue()) + accountNumberString;
        return new BigInteger(ibanStr);
    }
}
