package collection;

import java.util.*;

public class QueueExample {
    public static void main(String[] args){

        // Creating an object of PriorityQueue by referencing Queue
        Queue<Integer> values = new PriorityQueue<>();
        values.add(6);
        values.add(1);
        values.add(8);
        values.add(3);


        System.out.println("Printing Integer values in Priority Queue using Iterator: ");
        Iterator iterator = values.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("###########################");
        System.out.println("Printing Integer values using Poll method:");
        while(!values.isEmpty()){
            System.out.println(values.poll());
        }


        // Creating an object of PriorityQueue by referencing Queue
        Queue<String> states= new PriorityQueue<>();

        // Adding elements into the PriorityQueue object one by one
        // add() method can throw exception if it could not add an element
        states.add("Virginia");
        states.add("Illinois");
        states.add("Wisconsin");
        states.add("Ohio");

        // offer() method does not throw exception even it could not add an element
        // offer() method returns boolean value, if successfully added an element, it returns true
        // if it could not add an element, it returns false.
        //states.offer("Indiana");
        //states.offer("Kentucky");


        System.out.println("#####################");
        System.out.println("Printing states(String values) using iterator:");
        //Printing elements of the object (states) using Iterator
        Iterator iterator1=states.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("###################");
        System.out.println("Printing states(String values) using Poll method:");
        while(!states.isEmpty()){
            System.out.println(states.poll());
        }
        //states.peek();

        // Again re adding elements after using poll and making the object empty
        states.add("Virginia");
        states.add("Illinois");
        states.add("Wisconsin");
        states.add("Ohio");

        System.out.println();
        System.out.println("#####################");
        System.out.println("Printing states(String values) in natural order:");
        states.stream().sorted().forEach(x-> System.out.println(x));


        states.remove(); // throws exception if queue is empty
        //states.remove();
        //states.remove();
        //states.remove();
        //states.poll(); // does not throw exception if queue is empty
        //System.out.println(states.poll());


        System.out.println();
        System.out.println("#################");
        System.out.println("After removing first element of the Queue:");
        //Printing elements of the object (states) using Iterator after removing an element
         iterator=states.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("###################");
        System.out.println("To check which element is at the head of the queue:");

        // To check which element is at the head of the queue
        System.out.println(states.peek()); // retrieves head of the queue and does not throw exception

        System.out.println(states.element()); // retrieves head of the queue and throws an exception if queue is empty

        System.out.println();
        System.out.println("###################");
        System.out.println("To check the size of the queue:");
        System.out.println(states.size());

        System.out.println();
        System.out.println("###################");
        System.out.println("To check if the queue is empty or not:");
        System.out.println(states.isEmpty()); // it returns boolean value as true or false

        System.out.println();
        System.out.println("###################");
        System.out.println("To check if the particular element is in the queue:");
        System.out.println(states.contains("Virginia")); // it returns boolean value as true or false

    }
}
