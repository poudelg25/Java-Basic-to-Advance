package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Program started....: "+Thread.currentThread().getName());

        ExecutorService executorService = Executors.newSingleThreadExecutor();

       Future<Integer> future = executorService.submit(()->{ //asynchronous task
           Thread.sleep(5000);
           System.out.println(Thread.currentThread().getName());
            return (5 + 10);
        });
        System.out.println("Program2 is done by: "+Thread.currentThread().getName());
        System.out.println("Program3  is done by: "+Thread.currentThread().getName());
        //Thread.sleep(10000);
        System.out.println("Program4 is done by: "+Thread.currentThread().getName());
        System.out.println(future.isDone()); // Returns true if the task is finished, false otherwise
        int result = future.get(); // Blocking code - where it waits until it gets the result
        System.out.println(future.isDone());// returns True, since .get() has already completed the task and retrieved the result
        System.out.println(result);
        System.out.println("Program ended....: "+Thread.currentThread().getName());
        executorService.shutdown();
    }
}
