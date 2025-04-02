package collection;

import java.util.*;

public class SetExample {
    public static void main(String[] args){

        Set<Integer> numberSet = new HashSet<>(); // eliminates duplicate
        //Set<Integer> numberList = new LinkedHashSet<>(); //eliminates duplicate but maintains insertion order
        //Set<Integer> numberList = new TreeSet<>(); // eliminates duplicate but maintains natural order(sorted order
        // in ascending)
        //Set<Integer> numberList = new TreeSet<>(Comparator.reverseOrder()); // eliminates duplicate but maintains
        // natural order (in descending order)
        // Adding the particular element in Hash Set
        numberSet.add(40);
        numberSet.add(32);
        numberSet.add(55);
        numberSet.add(7);
        numberSet.add(32); // Since set has already 32, it does not allow to save duplicate value
        numberSet.add(32); // Since set has already 32, it does not allow to save duplicate value

        // Removing the particular element from Hash Set
        numberSet.remove(55);

        // Printing all elements of Hash Set
        System.out.println("Printing all unique elements in Hash Set:");
        Iterator iterator=numberSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("################");
        System.out.println("Check an element in the Hash Set:");
        // Checking if the particular element is in the Hash Set
        System.out.println(numberSet.contains(32));

        System.out.println("################");
        System.out.println("Checking the size of elements in Hash Set: ");
        // Counting the size of the elements  in the Hash Set
        System.out.println(numberSet.size());

        System.out.println("################");
        System.out.println("Checking if the Hash Set is empty: ");
        // Checking if the Hash Set is empty
        System.out.println(numberSet.isEmpty());

        System.out.println("################");
        System.out.println("Adding multiple elements from arrayList to Hash Set: ");
        // Adding multiple elements from array list to Hash Set
        List<Integer> numToAddList = new ArrayList<>();
        numToAddList.add(40);
        numToAddList.add(7);
        numToAddList.add(12);
        numToAddList.add(40);

        numberSet.addAll(numToAddList);
        iterator = numberSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("###############################");
        System.out.println("Printing elements from Linked Hash Set: ");
        Set<Integer> numberSet2 = new LinkedHashSet<>(); // eliminates duplicate & maintain insertion order
        numberSet2.add(40);
        numberSet2.add(32);
        numberSet2.add(55);
        numberSet2.add(7);
        numberSet2.add(32); // Since set has already 32,it does not allow to save duplicate value

        iterator = numberSet2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("###############################");
        System.out.println("Printing elements from Tree Set in natural order: ");

        Set<Integer> numberSet3 = new TreeSet<>(); // eliminates duplicate & maintain sorted order
        numberSet3.add(40);
        numberSet3.add(32);
        numberSet3.add(55);
        numberSet3.add(7);
        numberSet3.add(32); // Since set has already 32, it does not allow to save duplicate value

        iterator = numberSet3.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("###############################");
        System.out.println("Printing elements from Tree Set in descending(reversed order): ");

        Set<Integer> numberSet4 = new TreeSet<>(Comparator.reverseOrder()); // eliminates duplicate & maintain sorted descending order
        numberSet4.add(40);
        numberSet4.add(32);
        numberSet4.add(55);
        numberSet4.add(7);
        numberSet4.add(32); // Since set has already 32, it does not allow to save duplicate value

        iterator = numberSet4.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
