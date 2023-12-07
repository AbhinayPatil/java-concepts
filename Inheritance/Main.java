package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEnginePower(200);
        car.setNumberOfDoors(4);
        car.setName("Thar");

        //this was property of the parent(we are directly able to use this)
        car.setTopSpeed(300);
        System.out.println("\nCar Details: \n" + "Engine Power : "+car.getEnginePower()+"\n"+ "Number of Doors: " + car.getNumberOfDoors() + "\nName: " + car.getName()+"\nTop Speed: "+car.getTopSpeed());
    }
}
