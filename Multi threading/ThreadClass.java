public class ThreadClass extends Thread{
    private int ThreadNumber;
    ThreadClass(int ThreadNumber){
        this.ThreadNumber = ThreadNumber;
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+ " thread " + ThreadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
