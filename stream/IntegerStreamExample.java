package stream;

import java.util.ArrayList;
import java.util.List;

public class IntegerStreamExample {
    public static void main(String[] args){

        List<Integer> nums = new ArrayList<>();
        nums.add(34);
        nums.add(45);
        nums.add(2);
        nums.add(98);
        nums.add(473);

        // Using min() terminal operation, finding min value using stream from list of Integer
        System.out.println("##############");
        System.out.println("Printing minimum value from the list: ");
        System.out.println(nums.stream().min(Integer::compareTo).get());


        // Using max() terminal operation, finding max value using stream from list of Integer
        System.out.println("##############");
        System.out.println("Printing maximum value from the list: ");
        System.out.println(nums.stream().max(Integer::compareTo).get());


        // Using reduce() terminal operation, finding reduce value using stream from list of Integer
        System.out.println("##############");
        System.out.println("Printing reduce value from the list using sum: ");
        System.out.println(nums.stream().reduce(0, (a, b)-> a + b));
        //or System.out.println(nums.stream().reduce(0, Integer::sum));

        // Using count() terminal operation, counting total elements in the list
        System.out.println("#################");
        System.out.println("Finding total count from the list: ");
        System.out.println(nums.stream().count());
        // or System.out.println((long) nums.size());
    }
}
