package thread;

public class MultiThread extends Thread{

    public void run(){
        try {
            for (var i = 1; i <= 5; i++) {
                System.out.println(i + " : is processed by " + Thread.currentThread().getName()
                        + " thread"+" with priority: "+Thread.currentThread().getPriority());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.getStackTrace();
        }
    }
}
