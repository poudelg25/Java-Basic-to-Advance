package thread;

public class ThreadUseCase {
    public static void main(String[] args){

        // Example of synchronous programming
        System.out.println("Program Started...worked by: "+Thread.currentThread().getName()+" thread");

        for(var i=1; i<=5; i++){
            System.out.println(i+" worked by: "+Thread.currentThread().getName()+" thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
               e.getStackTrace();
            }
        }
        System.out.println("Program Ended.... worked by: "+Thread.currentThread().getName()+" thread");
    }
}
