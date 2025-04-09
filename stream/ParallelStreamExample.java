package stream;

import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args){

        List<Integer> nums = List.of(7, 5, 4, 6, 3, 9, 4, 8, 11);

        //Sequential stream example
        System.out.println("Example of stream or sequential stream(maintains order and worked by only one thread):");
        nums.stream().forEach(num-> System.out.println(num+" is processed by "+Thread.currentThread().getName()));


        // Parallel stream example
        System.out.println("#########################");
        System.out.println("Example of Parallel stream (does not maintain order and worked by many threads):");
        nums.parallelStream().forEach(num-> System.out.println(num+" is processed by "+Thread.currentThread().getName()));
        // or nums.stream().parallel().forEach(num-> System.out.println(num+" is processed by "+Thread.currentThread().getName()));
    }
}
