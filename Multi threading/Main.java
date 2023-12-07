
public class Main{
    public static void main(String[] args) {
        // using extends method(class)
        ThreadClass myThreadClass1 = new ThreadClass(0);
        myThreadClass1.start();

        ThreadClass myThreadClass2 = new ThreadClass(1);
        myThreadClass2.start();

        //using implements method(interface)
        RunnableInterface runnableInterface1= new RunnableInterface(2);
        Thread thread1 = new Thread(runnableInterface1);
        thread1.start();

        RunnableInterface runnableInterface2 = new RunnableInterface(3);
        Thread thread2 = new Thread(runnableInterface2);
        thread2.start();
    }
}