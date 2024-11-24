package de.tum.cit.ase;

public class Bank {

    public static void main(String[] args) {
        // Existing accounts for testing
        SavingsAccount savings = new SavingsAccount(4321, 5028.45, 0.02);
        BonusSaverAccount bonusSaver = new BonusSaverAccount(6543, 1475.85, 0.02);
        CheckingAccount checking = new CheckingAccount(9876, 269.93, savings);

        savings.deposit(148.04);
        bonusSaver.deposit(41.52);
        savings.withdraw(725.55);
        bonusSaver.withdraw(120.38);
        checking.withdraw(320.18);

        // Testing the CreditCardAccount functionality
        CreditCardAccount creditCard = new CreditCardAccount(7391, 300.0, 1000.00);
        creditCard.pay(532.45);       // should be successful
        creditCard.pay(467.54);       // should reach limit, succeeding with exactly 1000 used
        creditCard.pay(0.01);         // should fail (over limit)
        creditCard.compensate();      // clears credit balance by adjusting main balance
        creditCard.pay(23.01);        // should succeed after compensation
        creditCard.pay(532.45);       // should succeed
        creditCard.handleOverdraftInterest();  // applies interest if balance is negative
    }
}
