package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Program is Started by: "+Thread.currentThread().getName());

        // For CompletableFuture, runAsync() is used for tasks that do not return a result (void tasks).
   /*     CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("This is Completable future work completed by: "+Thread.currentThread().getName());
        });*/

        //CompletableFuture.supplyAsync() is used for tasks that return a result. It returns CompletableFuture<T>.
        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "This Completable future using supplyAsync() work is completed by: "+Thread.currentThread().getName();
        });

        System.out.println("Program-1 is done by: "+Thread.currentThread().getName());
        System.out.println("Program-2 is done by: "+Thread.currentThread().getName());
        //completableFuture.get();
        //String result = stringCompletableFuture.get();
        //System.out.println(result);
        //CompletableFuture<Void> result = stringCompletableFuture.thenAccept(str-> System.out.println(str.toUpperCase()));
        //result.get(); // Waits for the entire chain to complete

        // Example of chaining using thenApply() to transform the result
        CompletableFuture<String> result = stringCompletableFuture.thenApply(String::toUpperCase);

        // If we want to add some text to the result, we can use concat() as shown below:
        //CompletableFuture<String> result = stringCompletableFuture.thenApply(str->str.toUpperCase().concat(" Added string using concat"));

        System.out.println(result.get()); // Prints the uppercased string
        System.out.println("Program-3 is done by: "+Thread.currentThread().getName());
        System.out.println("Program is Ended by: "+Thread.currentThread().getName());
    }
}
