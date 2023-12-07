package Inheritance;

//this is the parent class
public class Vehicle {
    private int topSpeed;
    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void go(){
        System.out.println("Move");
    }
    public void stop(){
        System.out.println("Stop");
    }
}
