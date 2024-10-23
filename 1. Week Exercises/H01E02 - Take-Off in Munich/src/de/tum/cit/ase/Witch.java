package de.tum.cit.ase;

public class Witch {
    private String name;
    private int age;
    private boolean experiencedBroomOperator;
    private static final int PILOTS_RETIREMENT_AGE = 65;  // Static final variable for retirement age

    public Witch(String name, int age, boolean experiencedBroomOperator) {
        this.name = name;
        this.age = age;
        this.experiencedBroomOperator = experiencedBroomOperator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isExperiencedBroomOperator() {
        return experiencedBroomOperator;
    }

    public void setExperiencedBroomOperator(boolean experiencedBroomOperator) {
        this.experiencedBroomOperator = experiencedBroomOperator;
    }

    public String welcomePassengers(){
        return "Welcome on board! My name is " + this.name;
    }

    // Static method to check retirement status
    public static boolean isRetired(int age) {
        return age >= PILOTS_RETIREMENT_AGE;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Witch{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experiencedBroomOperator=" + experiencedBroomOperator +
                '}';
    }
}
