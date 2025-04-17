package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Program is Started by: "+Thread.currentThread().getName());
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("This is Completable future work completed by: "+Thread.currentThread().getName());
        });

        System.out.println("Program-1 is done by: "+Thread.currentThread().getName());
        System.out.println("Program-2 is done by: "+Thread.currentThread().getName());
        completableFuture.get();
        System.out.println("Program-3 is done by: "+Thread.currentThread().getName());
        System.out.println("Program is Ended by: "+Thread.currentThread().getName());
    }
}
