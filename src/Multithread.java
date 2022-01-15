public class Multithread extends Thread {

    private int threadNumder;
    public Multithread (int threadNumber){
        this.threadNumder = threadNumber;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println(i + " from thread" + threadNumder);
            if (threadNumder == 2){
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}