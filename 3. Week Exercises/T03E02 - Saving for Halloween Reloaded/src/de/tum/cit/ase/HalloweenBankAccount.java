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

    // TODO 2.1: Overloading the BankAccount Constructor

    public HalloweenBankAccount(String iban){
        this.iban = iban;
        // TODO 2.2: Calculate the bankCode and accountNumber for an IBAN
        this.bankCode = HalloweenBankServices.convertIBANToBankCode(this.iban);
        this.accountNumber = HalloweenBankServices.convertIBANToAccountNumber(this.iban);
    }

    public HalloweenBankAccount(String bankCode, String accountNumber){
        this.bankCode = bankCode;
        this.accountNumber = accountNumber;
        // TODO 2.3: Calculate the IBAN for a bankCode and accountNumber
        this.iban = HalloweenBankServices.generateIBAN(this.bankCode, this.accountNumber);
    }


    public int getBalance() {
        return balance;
    }

    public String getIban() {
        return iban;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String withdrawMoney(int amountWithdrawn) {
        this.balance -= amountWithdrawn;
        return "Your new balance is: " + this.balance;
    }

}
