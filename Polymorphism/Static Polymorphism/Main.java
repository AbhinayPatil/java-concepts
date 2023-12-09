

//static polymorphism means resolving methods at compile time.
//this is method overloading
class Add {
    public void addNumbers(int i, int j){
        System.out.println("sum is: "+ (i+j));
    }
    public void addNumbers(int i,int j,int k){
        System.out.println("sum is: "+(i+j+k));
    }
    public void addNumbers(int i,int j,long k){
        System.out.println("sum is: " + (i+j+k));
    }
}


public class Main {
    public static void main(String[] args) {
        Add add = new Add();
        add.addNumbers(1,2);
        add.addNumbers(1,2,3);
        add.addNumbers(1,2,3l);
    }
}
