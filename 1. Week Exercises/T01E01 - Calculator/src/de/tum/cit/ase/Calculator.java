package de.tum.cit.ase;

public class Calculator {

    // TODO 1: Declare the String attribute "storedValue"
    private String storedValue;

    // TODO 2: Declare and define the constructor for the class Calculator with one String parameter "storedValue"
    public Calculator(String storedValue) {
        this.storedValue = storedValue;
    }

    // TODO 3: Declare and define the constructor for the class Calculator with no parameter
    public Calculator() {
        this.storedValue = "0";
    }

    // TODO 4: Declare and define the getter for the String attribute "storedValue"
    public String getStoredValue() {
        return storedValue;
    }

    // TODO 5: Declare and define the setter for the String attribute "storedValue"
    public void setStoredValue(String storedValue) {
        this.storedValue = storedValue;
    }

    // TODO 6: Declare and define the "toString" method
    @Override
    public String toString() {
        return "Calculator{" + "storedValue='" + storedValue + '\'' + "}";
    }

    // TODO 7: Declare and define the "add" method with one String parameter "newValue"
    public void add(String newValue) {
        int currentValue = Integer.parseInt(storedValue);  // Convert storedValue to int
        int valueToAdd = Integer.parseInt(newValue);       // Convert newValue to int
        int result = currentValue + valueToAdd;            // Perform addition
        storedValue = String.valueOf(result);              // Store result as a string
    }

    // TODO 8: Declare and define the "subtract" method with one String parameter "newValue"
    public void subtract(String newValue) {
        int currentValue = Integer.parseInt(storedValue);  // Convert storedValue to int
        int valueToSubtract = Integer.parseInt(newValue);       // Convert newValue to int
        int result = currentValue - valueToSubtract;            // Perform addition
        storedValue = String.valueOf(result);              // Store result as a string
    }

}