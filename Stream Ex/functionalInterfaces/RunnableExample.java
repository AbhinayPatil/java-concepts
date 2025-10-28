package functionalInterfaces;

class ThreadDemo implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class RunnableExample {

    public static void main(String[] args) {
//        Thread thread = new Thread(new ThreadDemo());
//        thread.start();

        Thread thread1 = new Thread(()->{
            for(int i=0; i<5; i++) {
                System.out.println("Thread1 is running... " + i);
            }
        });

        Thread thread2 = new Thread(()->{
            for(int i=0; i<5; i++) {
                System.out.println("Thread2 is running... " + i);
            }
        });

        thread1.start();
        thread2.start();
    }

}
