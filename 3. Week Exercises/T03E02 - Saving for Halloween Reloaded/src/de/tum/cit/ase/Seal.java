package de.tum.cit.ase;

public class Seal {
    private static int minimumAge = 18;
    private String name;
    private boolean organiser;
    private int age;
    // TODO 1.1: Implement the unidirectional association
    private HalloweenBankAccount halloweenBankAccount;

    public Seal(String name, boolean organiser, int age) {
        this.name = name;
        this.organiser = organiser;
        this.age = age >= minimumAge ? age : minimumAge;
    }

    public Seal(String name, boolean organiser, int age, HalloweenBankAccount bankAccount) {
        this(name, organiser, age); // Call the first constructor
        this.halloweenBankAccount = bankAccount;
    }

    // TODO 1.2: Overloading the Seal Constructor

    public static int getMinimumAge() {
        return minimumAge;
    }

    public String getName() {
        return name;
    }

    public boolean isOrganiser() {
        return organiser;
    }

    public int getAge() {
        return age;
    }

    // TODO 1.1: Implement the unidirectional association

    public HalloweenBankAccount getHalloweenBankAccount() {
        return halloweenBankAccount;
    }

    public static void setMinimumAge(int minimumAge) {
        Seal.minimumAge = minimumAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrganiser(boolean organiser) {
        this.organiser = organiser;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // TODO 1.1: Implement the unidirectional association

    public void setHalloweenBankAccount(HalloweenBankAccount bankAccount) {
        this.halloweenBankAccount = bankAccount;
    }

    public String outputWelcomeMessage() {
        return "Hello " + (organiser ? "organiser " : "") + this.name + ". Nice to see you again!";
    }


}
