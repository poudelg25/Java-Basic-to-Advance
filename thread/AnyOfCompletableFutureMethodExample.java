package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AnyOfCompletableFutureMethodExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Program started..: "+Thread.currentThread().getName());

        // First async task - completes after 2 seconds
        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000); // Simulate delay
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("completableFuture1 is completed by: "+Thread.currentThread().getName());
            return 100;
        });
        // Second async task - completes after 5 seconds
        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(5000); // Simulate longer delay
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("completableFuture2 is completed by: "+Thread.currentThread().getName());
            return 200;
        });

        System.out.println("Program-2 is completed by: "+Thread.currentThread().getName());
        // anyOf() completes as soon as the first future completes
        CompletableFuture<Object> anyOfCompletableFuture = CompletableFuture.anyOf(completableFuture1, completableFuture2);
        System.out.println("Is any of the completableFuture completed?: "+anyOfCompletableFuture.isDone());
        // Wait and get the result of the first completed future
        System.out.println("Result is: "+anyOfCompletableFuture.get());
        System.out.println("Is any of the completableFuture completed?: "+anyOfCompletableFuture.isDone());
        System.out.println("Program-3 is completed by: "+Thread.currentThread().getName());
    }
}
