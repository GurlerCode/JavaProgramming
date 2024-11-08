package de.tum.cit.ase;

public class HalloweenBankAccount {

    private int balance;
    private String iban;
    private String bankCode;
    private String accountNumber;

    public HalloweenBankAccount(int balance, String iban, String bankCode, String accountNumber) {
        this.balance = balance;
        this.iban = iban;
        this.bankCode = bankCode;
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBankCode() {
        return bankCode;
    }
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String withdrawMoney(int amountWithdrawn){
        balance -= amountWithdrawn;
        return "Your new balance is: " + balance;
    }
    
}
