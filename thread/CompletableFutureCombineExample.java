package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureCombineExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Program started...: "+Thread.currentThread().getName());

        // First asynchronous task returning 100
        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("completableFuture1 is completed by: "+Thread.currentThread().getName());
            return 100;
        });
        // Simulate main thread doing other work
        System.out.println("Program-2 is completed by: "+Thread.currentThread().getName());
        System.out.println("Program-3 is complete by: "+Thread.currentThread().getName());

        // Second asynchronous task returning 200
        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("completableFuture2 is completed by: "+Thread.currentThread().getName());
            return 200;
        });

        System.out.println("Program-4 is completed by: "+Thread.currentThread().getName());
        System.out.println("Program-5 is completed by: "+Thread.currentThread().getName());

        // Combine results from both futures once completed
        CompletableFuture<Integer> integerCompletableFuture = completableFuture1.thenCombine(completableFuture2,(n1, n2)-> n1+n2);
        // or CompletableFuture<Integer> integerCompletableFuture = completableFuture1.thenCombine(completableFuture2, Integer::sum);

        // Wait and get the combined result
        Integer result = integerCompletableFuture.get();
        System.out.println("The sum of two CompletableFutures is :"+result);
        System.out.println("Program ended..:"+Thread.currentThread().getName());
    }
}
