package de.tum.cit.ase;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = InputReader.readInt("Enter the number: ");
        int originalNumber = number;
        int reverse = 0;

        // TODO: calculate the inversion of the number
        while (number > 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        System.out.println("Reverse of " + originalNumber + " is " + reverse);
    }
}
