package thread;


public class MultiThreadingExample {
    public static void main(String[] args){
        System.out.println("Program started...: "+Thread.currentThread().getName()+" thread");

        //MultiThread thread1 = new MultiThread(4000);
        MultiThread thread1 = new MultiThread();
        thread1.setName("First");
        thread1.setPriority(Thread.MIN_PRIORITY);
        //or thread1.setPriority(1);
        thread1.start();

        MultiThread thread2 = new MultiThread();
        //MultiThread thread2 = new MultiThread(2000);
        thread2.setName("Second");
        thread2.setPriority(Thread.MAX_PRIORITY);
        //or thread2.setPriority(10);
        thread2.start();

        System.out.println("Program ended...: "+Thread.currentThread().getName()+" thread");
    }
}
