package thread;

public class MultiThread extends Thread{
    /*int sleep;
    public MultiThread(int sleep){
        this.sleep =sleep;
    }*/

    public void run(){
        try {
            for (var i = 1; i <= 5; i++) {
                System.out.println(i + " : is processed by " + Thread.currentThread().getName()
                        + " thread"+" with priority: "+Thread.currentThread().getPriority());
                Thread.sleep(3000);
                //Thread.sleep(sleep);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
