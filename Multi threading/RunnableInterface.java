public class RunnableInterface implements Runnable {
    private int ThreadNumber;
    RunnableInterface(int ThreadNumber){
        this.ThreadNumber = ThreadNumber;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i + " Thread " + ThreadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
