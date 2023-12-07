package Encapsulation;

class Main{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            Dog dog = new Dog();
            dog.setAge(i+5);
            dog.setName("Dog" + String.valueOf(i));
            dog.setBreed("breed" + String.valueOf(i));
        }
        System.out.println(Dog.animal);
        Dog.sound();     
    }
}
