package de.tum.cit.ase;

public class Seal {

    private String name;
    private boolean organiser;
    private int age;
    public static int minimumAge = 18;

    public Seal(String name, boolean organiser, int age) {
        this.name = name;
        this.organiser = organiser;
        if (age < minimumAge) {
            this.age = minimumAge;
        } else {
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOrganiser() {
        return organiser;
    }

    public void setOrganiser(boolean organiser) {
        this.organiser = organiser;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String outputWelcomeMessage(){
        if (organiser){
            return "Hello organiser " + this.name + ". Nice to see you again!";
        } else {
            return "Hello " + this.name + ". Nice to see you again!";
        }
    }

}
