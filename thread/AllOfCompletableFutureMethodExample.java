package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AllOfCompletableFutureMethodExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Program Started...: "+Thread.currentThread().getName());

        // First async task that returns 100 after 3 seconds
        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("completableFuture1 is completed by: "+Thread.currentThread().getName());
            return 100;
        });

        // Second async task that returns 200 after 4 seconds
        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("completableFuture2 is completed by: "+Thread.currentThread().getName());
            return 200;
        });

        System.out.println("Program-2 is completed by: "+Thread.currentThread().getName());
        // Wait for both futures to complete
        CompletableFuture<Void> allOfCompletableFuture = CompletableFuture.allOf(completableFuture1, completableFuture2);
        System.out.println("is allOfCompletableFuture completed?: "+allOfCompletableFuture.isDone());
        // Run a task once all futures are done
        allOfCompletableFuture.thenRunAsync(()-> System.out.println("All completableFutures completed"));
        Thread.sleep(5000); // Let async tasks finish
        System.out.println("is allOfCompletableFuture completed?: "+allOfCompletableFuture.isDone());
        //allOfCompletableFuture.get();
        System.out.println("Program-3 is completed by: "+Thread.currentThread().getName());
        System.out.println("Program ended: "+Thread.currentThread().getName());
    }
}
