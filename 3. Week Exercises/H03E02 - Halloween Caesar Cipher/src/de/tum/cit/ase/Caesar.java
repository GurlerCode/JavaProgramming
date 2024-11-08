package de.tum.cit.ase;

public class Caesar {
    /**
     * Encrypts a String with the caesar cipher by shifting the chars by a specified amount.
     * Only letters from 'a' to 'z' and 'A' to 'Z' will be encrypted. All other chars should stay the same.
     * Positive numbers indicate a right shift.
     * Negative numbers indicate a left shift.
     *
     * @param plainText The plain text
     * @param shift     The shift amount
     * @return The encrypted text
     */
    public String encrypt(String plainText, int shift) {
        // TODO Task 1: Implement the Caesar cipher encryption
        StringBuilder encryptedText = new StringBuilder();
        shift = (shift % 26 + 26) % 26;

        for (int i = 0; i < plainText.length(); i++) {
            char currentChar = plainText.charAt(i);

            if (currentChar >= 'A' && currentChar <= 'Z' ) {
                char newChar = (char) ((currentChar - 'A' + shift) % 26 + 'A');
                encryptedText.append(newChar);
            } else if (currentChar >= 'a' && currentChar <= 'z' ) {
                char newChar = (char) ((currentChar - 'a' + shift) % 26 + 'a');
                encryptedText.append(newChar);
            } else {
                encryptedText.append(currentChar);
            }
        }
        return encryptedText.toString();
    }

    /**
     * Decrypts a String with the caesar cipher by shifting the chars by a specified amount.
     * Only letters from 'a' to 'z' and 'A' to 'Z' will be decrypted. All other chars should stay the same.
     * Positive numbers indicate a right shift.
     * Negative numbers indicate a left shift.
     *
     * @param encryptedText The encrypted text
     * @param shift         The shift amount
     * @return The plain text
     */
    public String decrypt(String encryptedText, int shift) {
        // TODO Task 2: Implement the Caesar cipher decryption
        shift = (shift % 26 + 26) % 26;
        return encrypt(encryptedText, -shift);
    }

    /**
     * Finds the caesar shift between a plain and encrypted text
     *
     * @param plainText     The plain text
     * @param encryptedText The encrypted text
     * @return The shift in range -25 to 25
     */
    public int getShift(String plainText, String encryptedText) {
        if (plainText.length() != encryptedText.length()) {
            return 0; // Invalid if lengths differ
        }

        // Find shift by comparing the first character's shift
        for (int i = 0; i < plainText.length(); i++) {
            char plainChar = plainText.charAt(i);
            char encryptedChar = encryptedText.charAt(i);

            if (Character.isLetter(plainChar) && Character.isLetter(encryptedChar)) {
                int shift;
                if (Character.isUpperCase(plainChar) && Character.isUpperCase(encryptedChar)) {
                    shift = (encryptedChar - plainChar + 26) % 26;
                } else if (Character.isLowerCase(plainChar) && Character.isLowerCase(encryptedChar)) {
                    shift = (encryptedChar - plainChar + 26) % 26;
                } else {
                    continue; // Skip if not both uppercase or both lowercase
                }

                // Verify the calculated shift across the text
                for (int j = 0; j < plainText.length(); j++) {
                    char pChar = plainText.charAt(j);
                    char eChar = encryptedText.charAt(j);

                    if (Character.isUpperCase(pChar) && Character.isUpperCase(eChar)) {
                        if ((eChar - pChar + 26) % 26 != shift) return 0;
                    } else if (Character.isLowerCase(pChar) && Character.isLowerCase(eChar)) {
                        if ((eChar - pChar + 26) % 26 != shift) return 0;
                    } else if (Character.isLetter(pChar) || Character.isLetter(eChar)) {
                        return 0;
                    }
                }

                // Return shift in range -25 to 25
                return shift <= 25 ? shift : shift - 26;
            }
        }
        return 0; // Default to 0 if no consistent shift found
    }
}
