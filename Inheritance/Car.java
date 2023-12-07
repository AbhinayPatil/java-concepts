package Inheritance;

//this is the subclass 
public class Car extends Vehicle{
    private int numberOfDoors;
    private int enginePower;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public int getEnginePower() {
        return enginePower;
    }
    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    };

}
