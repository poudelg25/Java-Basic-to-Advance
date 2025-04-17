package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        System.out.println("Program Started....: "+Thread.currentThread().getName());

        //Create a fixed thread pool with 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);


        for (int t = 1; t <= 5; t++) {
            int taskNumber = t;
            // Submit a task to the thread pool
            executorService.submit(() -> {
                try {
                    for (var i = 1; i <= 5; i++) {
                        System.out.println(i + " is processed by " + Thread.currentThread().getName());
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        // Shut down the executor service after task completion
        executorService.shutdown();
    }
}
