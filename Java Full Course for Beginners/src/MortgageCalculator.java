import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner sc = new Scanner(System.in);

        System.out.print("Principal : ");
        double principal = sc.nextDouble();
        while (!(999 < principal && principal < 1000001)) {
            System.out.println("Invalid principal value!");
            System.out.print("Please enter a number between 1K and 1M!: ");
            principal = sc.nextDouble();
        }

        System.out.print("Annual Interest Rate : ");
        double annualInterestRate = sc.nextDouble();
        while (!(0 < annualInterestRate && annualInterestRate < 30)) {
            System.out.println("Invalid annual interest rate value!");
            System.out.print("Please enter an interest rate greater than 0 and less than 30!: ");
            annualInterestRate = sc.nextDouble();
        }
        double monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years) : ");
        int period = sc.nextInt();
        while (!(0 < period && period < 30)) {
            System.out.println("Invalid period value!");
            System.out.print("Please enter a period greater than 0 and less than 30!: ");
            period = sc.nextInt();
        }
        int monthsNum = period * MONTHS_IN_YEAR;

        double mortgageNumerator  = principal * monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, monthsNum));
        double mortgageDenominator = (Math.pow(1 + monthlyInterestRate, monthsNum)) - 1;

        // NumberFormat mortgage =  NumberFormat.getCurrencyInstance();
        double mortgage = mortgageNumerator / mortgageDenominator;
        NumberFormat euroFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY); // Locale for Euro
        String formattedMortgage = euroFormat.format(mortgage);
        System.out.println("Your monthly mortgage payment is: " + formattedMortgage);

    }
}
