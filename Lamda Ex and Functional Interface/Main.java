//Functional interface
//It has only one non overridable method
//non overridable maane toh khudke custom methods
@FunctionalInterface
interface A{
    void show();
    String toString();//this is allowed bcoz this is overidable method.
    //It is already included in object class    
    
    //void newFun(); this is not allowed
}
public class Main {
    public static void main(String[] args) {
        
        //to use the functional interface we need it to be implemented in a class
        //so to save creation of another class we can create inner class using lambda expression

        A a = () -> System.out.println("This is how it works");
        a.show(); 
    }
}



// What is Java lambda expression?
// In Java, Lambda expressions basically express instances of functional interfaces (An interface with a single abstract method is called a functional interface). 
// Lambda Expressions in Java are the same as lambda functions which are the short block of code that accepts input as parameters and returns a resultant value.