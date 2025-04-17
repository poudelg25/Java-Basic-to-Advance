package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {
    public static void main(String[] args) {

        System.out.println("Program started...: "+Thread.currentThread().getName());

        // Create a single-threaded executorService
        ExecutorService executorService = Executors.newSingleThreadExecutor();
       // Since we are not returning any value, we are using Runnable(not Callable).
        // If we were returning a value, it would require a Callable.
        executorService.submit(()->{
            try {
                for (var i = 1; i <= 5; i++) {
                    System.out.println(i + " : is processed by " + Thread.currentThread().getName()
                            + " thread"+" with priority: "+Thread.currentThread().getPriority());
                    Thread.sleep(2000); // Sleeps for 2 seconds between each print
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        // Always shutdown the executor to free up resources after task execution
        executorService.shutdown();

    }
}
