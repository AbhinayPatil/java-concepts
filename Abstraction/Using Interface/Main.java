interface I{
    int i=10;
    //these are predefined as public static final

    void show();
    //interface can have only abstract methods
    //this means no body and only defining
    //these are predefined as public abstract methods
}

class Main implements I{
    @Override
    public void show(){
        System.out.println("Interface implemented");
    }

    public static void main(String[] args) {
        I InterfaceObj = new Main();
        InterfaceObj.show();
        System.out.println(I.i);
    }
}