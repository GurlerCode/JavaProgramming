package de.tum.cit.ase;

public class CreditCardAccount extends BankAccount {

    private double creditBalance;
    private final double limit;

    public CreditCardAccount(int accountId, double initial, double limit) {
        super(accountId, initial);
        this.limit = limit;
        this.creditBalance = 0;
    }

    // pay method allows customers to pay using credit within limit
    public boolean pay(double amount) {
        System.out.printf("Pay from account %d%nAmount:\t\t\t\t%.17f%n", accountId, amount);

        if ((Math.abs(creditBalance) + amount) > limit) {
            System.out.println("Sorry, insufficient balance...\n");
            return false;
        }

        creditBalance -= amount; // Subtracting amount to reflect it as debt
        System.out.printf("New credit balance:\t%.17f%n%n", creditBalance);
        return true;
    }

    // Compensate method
    public void compensate() {
        System.out.printf("Compensate account %d%n", accountId);

        balance += creditBalance;  // Adding to offset the negative balance
        creditBalance = 0;

        System.out.printf("New balance:\t\t%.14f%n", balance); // Ensuring 14 decimal precision
        System.out.printf("New credit balance:\t%.2f%n", creditBalance);
    }

    // Handle overdraft interest
    public void handleOverdraftInterest() {
        System.out.printf("Handle overdraft interest for account %d%n", accountId);

        double overdraftInterest = 0;
        if (balance < 0) {
            overdraftInterest = Math.abs(balance) * 0.05;
            balance -= overdraftInterest;
            System.out.printf("Overdraft interest:\t%.14f%n", overdraftInterest);
        }

        System.out.printf("New balance:\t\t%.14f%n", balance); // Always print balance at 14 decimal places
    }
}
