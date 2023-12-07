abstract class MyClass{
    int i= 10;//no predefined modifiers
    public int j=20;
    static int k=30;

    //abstract class can have both, abstract method and non abstract method
    abstract void show(); // this is an abstract method (has no body)

    public void display(String name){
        System.out.println("My name is "+name);
    }
}

class Main extends MyClass{
    @Override
    public void show(){
        System.out.println("this is content of an abstract method");
    }

    public static void main(String[] args) {
        System.out.println(MyClass.k);//only k can be called this way bcoz its static(not an instance but common value for whole class)
        MyClass object = new Main();
        object.display("Abhinay");
        object.show();
        System.out.println(object.i + " "+ object.j);
    }
}
