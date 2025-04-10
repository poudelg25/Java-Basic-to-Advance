package thread;

public class ExtendThreadExample{
    public static void main(String[] args){

        System.out.println("Main Thread: "+Thread.currentThread().getName());

        //Creating custom thread objects by extending thread Class
        // All threads can run in parallel
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();;

        MyThread myThread2 = new MyThread();
        myThread2.test();
    }
}
