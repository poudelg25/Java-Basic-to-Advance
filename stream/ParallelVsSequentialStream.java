package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelVsSequentialStream {
    public static void main(String[] args){
        List<Integer> num = new ArrayList<>();
        for(var i =1; i<= 10000000;i++){
            num.add(i);
        }

    // Checking performance between sequential stream and parallel stream

    // Checking sequential stream performance
        System.out.println("###############");
    long startTime = System.currentTimeMillis();
       num.stream().mapToLong(Integer::longValue).sum();
        System.out.println("Time taken by sequential stream: "+(System.currentTimeMillis()-startTime)+" ms");


        // Checking parallel stream performance
        System.out.println();
        System.out.println("################");
        startTime = System.currentTimeMillis();
        num.parallelStream().mapToLong(Integer::longValue).sum();
        System.out.println("Time taken by Parallel stream: "+(System.currentTimeMillis()-startTime));
    }
}
