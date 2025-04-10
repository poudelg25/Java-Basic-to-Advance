package thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("My Thread: "+Thread.currentThread().getName());
    }

    public void test(){
        System.out.println("Test Thread: "+Thread.currentThread().getName());
    }
}
