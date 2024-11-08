package de.tum.cit.ase;

public class Main {
    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        String plain = "Why is Not Possible!?";
        String encrypted = caesar.encrypt(plain, 50);
        String decrypted = caesar.decrypt(encrypted, 50);
        int shift = caesar.getShift(decrypted, encrypted);
        System.out.println("Plain: " + plain);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        System.out.println("Shift: " + shift);
    }
}
