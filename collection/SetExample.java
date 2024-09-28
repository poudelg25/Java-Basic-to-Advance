package collection;

import java.util.*;

public class SetExample {
    public static void main(String[] args){

        Set<Integer> numberList = new HashSet<>(); // eliminates duplicate
        //Set<Integer> numberList = new LinkedHashSet<>(); //eliminates duplicate but maintains insertion order
        //Set<Integer> numberList = new TreeSet<>(); // eliminates duplicate but maintains natural order(sorted order in ascending)
        //Set<Integer> numberList = new TreeSet<>(Comparator.reverseOrder()); // eliminates duplicate but maintains natural order (in descending order)
        // Adding the particular element in Hash Set
        numberList.add(40);
        numberList.add(32);
        numberList.add(55);
        numberList.add(7);
        numberList.add(32); // Since set has already 32, it does not allow to save duplicate value
        numberList.add(32); // Since set has already 32, it does not allow to save duplicate value

        // Removing the particular element from Hash Set
        numberList.remove(55);

        // Printing all elements of Hash Set
        Iterator iterator=numberList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("################");
        // Checking if the particular element is in the Hash Set
        System.out.println(numberList.contains(32));

        System.out.println("################");
        // Counting the size of the elements  in the Hash Set
        System.out.println(numberList.size());

        System.out.println("################");
        // Checking if the Hash Set is empty
        System.out.println(numberList.isEmpty());

        System.out.println("################");
        // Adding multiple elements from array list to Hash Set
        List<Integer> numToAddList = new ArrayList<>();
        numToAddList.add(40);
        numToAddList.add(7);
        numToAddList.add(12);
        numToAddList.add(40);

        numberList.addAll(numToAddList);
        iterator = numberList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
