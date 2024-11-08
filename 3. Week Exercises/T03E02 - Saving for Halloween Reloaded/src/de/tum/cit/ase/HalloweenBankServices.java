package de.tum.cit.ase;

public class HalloweenBankServices {
    public static String convertIBANToBankCode(String IBAN) {
        return IBAN.substring(4, 12);
    }

    public static String convertIBANToAccountNumber(String IBAN) {
        return IBAN.substring(12, 22);
    }

    public static String generateIBAN(String bankCode, String accountNumber) {
        return "DE" + "11" + bankCode + accountNumber;
    }

    // TODO 3.1: Implement the createBankAccountForSeal() method
    public static HalloweenBankAccount createBankAccountForSeal(Seal seal, String iban) {
        HalloweenBankAccount account = new HalloweenBankAccount(iban);
        seal.setHalloweenBankAccount(account);
        return account;
    }

    // TODO 3.2: Implement the withdrawMoney(Seal, int) method
    public static String withdrawMoney(Seal seal, int amountWithdrawn) {
        HalloweenBankAccount account = seal.getHalloweenBankAccount();
        if (account != null){
            return account.withdrawMoney(amountWithdrawn);
        } else {
            return "No bank account associated with this seal.";
        }
    }

}
