package Inheritance;

//this is the subclass
public class Bike extends Vehicle{
    private int enginePower;
    private int numberOfWheels;
    private String name;

    public int getEnginePower() {
        return enginePower;
    }
    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
