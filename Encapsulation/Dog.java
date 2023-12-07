package Encapsulation;


//encapsulation helps in data hiding(using private modifiers)
//helps to make data read-only, write-only, or both(using getter and setter)
//every java class is an example of encapsulation
public class Dog {
    public static final String animal = "Dog";
    private String name;
    private String breed;
    private int age;

    //if u only want to allow writing of data then have only setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age>0)
            this.age = age;
        else    
            this.age=0;
    }

    public static void sound(){
        System.out.println("Bark");
    }
}
