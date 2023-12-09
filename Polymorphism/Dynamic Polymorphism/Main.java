
class Animal{
    void show(){
        System.out.println("I am an animal");
    }
    void hear(){
        System.out.println("They can hear");
    }
}

class Fish extends Animal{
    @Override
    void show(){
        System.out.println("I am a fish");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.show();
        Fish fish = new Fish();
        fish.show();

        //Animal is reference  and  Fish is the object for creation
        Animal animal2 = new Fish();
        animal2.show();

        
    }
}
