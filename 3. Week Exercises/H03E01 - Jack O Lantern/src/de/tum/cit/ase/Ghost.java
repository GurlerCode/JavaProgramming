package de.tum.cit.ase;

public class Ghost {

    private String temper;
    private int age;
    private double weight;
    private static double maxWeight = 20.0;

    public Ghost(String temper, int age, double weight) {
        this.temper = temper;
        this.age = age;
        this.weight = weight;
    }

    public String getTemper() {
        return temper;
    }
    public void setTemper(String temper) {
        this.temper = temper;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double scarePower(){
        return age * weight;
    }

    public double calculateWeight() {
        return weight;
    }

    public static double calculateMaxWeight(){
        return maxWeight;
    }

}
