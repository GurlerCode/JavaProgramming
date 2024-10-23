package de.tum.in.ase;

public class Sky {
    
    // TODO 1: Declare the static double variable "averageTemperature" and initialise it with the value 15.0
    private static double averageTemperature = 15.0;

    // TODO 2: Declare the double attribute "temperature"
    private double temperature;

    // TODO 3: Declare the boolean attribute "windy"
    private boolean windy;

    // TODO 4: Declare the int attribute "precipitation"
    private int precipitation;

    // TODO 5: Declare the double attribute "daytimeLength"
    private double daytimeLength;

    // TODO 6: Declare and define the constructor for the class Sky with the double parameter
    //  "temperature", the boolean parameter "isWindy", the int parameter "precipitation", and the double parameter "daytimeLength"
    public Sky (double temperature, boolean windy, int precipitation, double daytimeLength) {
        this.temperature = temperature;
        this.windy = windy;
        this.precipitation = precipitation;
        this.daytimeLength = daytimeLength;
    }

    // TODO 7: Declare and define the getter method for the static double variable "averageTemperature"
    public static double getAverageTemperature() {
        return averageTemperature;
    }

    // TODO 8: Declare and define the setter method for the static double variable "averageTemperature"
    public static void setAverageTemperature(double avgTemperature) {
        averageTemperature = avgTemperature;
    }

    // TODO 9: Declare and define the getter method for the double attribute "temperature"
    public double getTemperature() {
        return temperature;
    }

    // TODO 10: Declare and define the setter method for the double attribute "temperature"
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // TODO 11: Declare and define the getter method for the boolean attribute "windy"
    public boolean isWindy() {
        return windy;
    }

    // TODO 12: Declare and define the setter method for the boolean attribute "windy"
    public void setWindy(boolean windy) {
        this.windy = windy;
    }

    // TODO 13: Declare and define the getter method for the int attribute "precipitation"
    public int getPrecipitation() {
        return precipitation;
    }

    // TODO 14: Declare and define the setter method for the int attribute "precipitation"
    public void setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
    }

    // TODO 15: Declare and define the getter method for the double attribute "daytimeLength"
    public double getDaytimeLength() {
        return daytimeLength;
    }

    // TODO 16: Declare and define the setter method for the double attribute "daytimeLength"
    public void setDaytimeLength(double daytimeLength) {
        this.daytimeLength = daytimeLength;
    }

    // TODO 17: Declare and define the method "toString" with no parameters
    @Override
    public String toString() {
        return "Today the temperature is " + temperature +" degree Celsius.\n" +
                "Is today wind expected: " + windy + "\n" +
                "Today the expected precipitation is: " + precipitation;
    }

    // TODO 18: Declare and define the method "changeTemperature" with the double parameter "amount"
    public void changeTemperature(double amount) {
        this.temperature += amount;
    }

    // TODO 19: Declare and define the method "changeDaytimeLength" with the double parameter "amount"
    public void changeDaytimeLength(double amount) {
        this.daytimeLength += amount ;
    }

    // TODO 20: Declare and define the method "createWind" with no parameters
    public void createWind(){
        windy = true;
        this.temperature -= 2;
    }

    // TODO 21: Declare and define the method "rain" with the int parameter "rainAmount"
    public void rain(int rainAmount){
        this.precipitation = rainAmount;
        this.temperature -= 3;
    }

    // TODO 22: Declare and define the method "snow" with the int parameter "snowAmount"
    public void snow(int snowAmount){
        this.precipitation = snowAmount/2;
        this.temperature = 0;
    }
}
