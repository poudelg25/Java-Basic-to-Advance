package thread;

public class UserThread implements Runnable{
    @Override
    public void run() {
        System.out.println("User Thread: "+Thread.currentThread().getName());
    }
}
