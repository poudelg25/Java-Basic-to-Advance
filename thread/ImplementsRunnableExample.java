package thread;

public class ImplementsRunnableExample {
    public static void main(String[] args) {
        System.out.println("Main Thread: "+Thread.currentThread().getName());

        Thread thread = new Thread(new UserThread());
        thread.start();

        Thread thread1 = new Thread(new UserThread());
        thread1.start();

        System.out.println("Main Thread2: "+Thread.currentThread().getName());

    }
}
