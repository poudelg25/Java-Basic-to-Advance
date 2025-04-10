package thread;

public class ThreadExample {
    public static void main(String[] args){
        int num = 5;
        System.out.println(num+" is processed by "+Thread.currentThread().getName());
    }
}
