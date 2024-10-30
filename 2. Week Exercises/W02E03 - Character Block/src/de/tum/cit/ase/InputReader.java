package de.tum.cit.ase;

import java.util.Scanner;

public class InputReader {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Tries to read an <code>int</code> from the console, and retries if the input
     * was not a valid integer.
     *
     * @see Integer#parseInt(String)
     */
    public static int readInt() {
        Integer value = null;
        do {
            try {
                String line = scanner.nextLine();
                value = Integer.parseInt(line.strip());
            } catch (@SuppressWarnings("unused") NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        } while (value == null);
        return value;
    }

    public static int readInt(String text) {
        System.out.println(text);
        return readInt();
    }

    public static char readChar() {
        String line = "";
        do {
            line = scanner.nextLine();
        } while (line.isEmpty());
        return line.charAt(0);
    }

    public static char readChar(String text) {
        System.out.println(text);
        return readChar();
    }

    public static String readString() {
        String line = "";
        do {
            line = scanner.nextLine();
        } while (line.isEmpty());
        return line;
    }

    public static String readString(String text) {
        System.out.println(text);
        return readString();
    }
}