package collection;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args){

        List<String> states = new ArrayList<>(12);
        //List<String> states = new LinkedList<>();
        //List<String> states = new Vector<>();
        // Adding value one by one in the array list
        states.add("Illinois");
        states.add("Wisconsin");
        states.add("Texas");
        states.add("Virginia");
        states.add("Michigan");
        states.add("Ohio");
        states.add("Indiana");
        states.add("Texas");
        states.add("Michigan");


        // Removing a value from the array list
        states.remove("Texas");

        // We can use traditional for each loop to print the state's name
        System.out.println("Using for each loop:");
        for(String s: states){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("###################################");
        System.out.println("Using Iterator:");

        // We always use iterator to print the state's name(Array List name)
        Iterator iterator = states.iterator();
        while(iterator.hasNext()){
         /*   String s = (String)iterator.next();
            System.out.println(s); or */
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("###################################");
        System.out.println("Using addAll method:");
        // Creating new Array list and initializing values.
        List<String> states1=new ArrayList<>();
        states1.add("New York");
        states1.add("Delaware");
        states1.add("Colorado");

        // Adding list of values in the array list
        states.addAll(states1);

        // Using iterator to print the elements of the array list after adding list of values
        iterator = states.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("###################################");
        System.out.println("Using removeALl method:");
        // Removing the list of elements and printing the elements of remaining elements
        states.removeAll(states1);
        iterator=states.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("###################################");
        System.out.println("Using allAdd method with adding list of elements:");
        // Adding multiple elements in the array list using List.of() method and printing the all elements afterward
        states.addAll(List.of("South Dakota", "Alabama", "Kentucky"));
        iterator=states.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // Removing the multiple elements using List.of() method and printing remaining elements
        System.out.println();
        System.out.println("###################################");
        System.out.println("Using removeAll method to remove elements by passing list of elements:");
        states.removeAll(List.of("Michigan","Texas", "Illinois", "Wisconsin"));
        iterator=states.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("###################################");
        System.out.println("Checking if the list is empty:");
        System.out.println(states.isEmpty());

        // Printing the element of zero index from the array list
        System.out.println();
        System.out.println("###################################");
        System.out.println("Printing the element of zero index:");
        System.out.println(states.get(0));

        // Printing the size of the array list
        System.out.println();
        System.out.println("###################################");
        System.out.println("Printing the size of the list:");
        System.out.println(states.size());

        System.out.println();
        System.out.println("###################################");
        System.out.println("Checking if the element contains in the array list:");
        // Printing the true or false value by checking if the element contain in the array list or not.
        System.out.println(states.contains("Virginia"));

        System.out.println();
        System.out.println("###################################");
        System.out.println("Printing the index of the element found on the array list:");
        // Printing the index of the element that we are checking in the array list
        System.out.println(states.indexOf("South Dakota"));

        System.out.println();
        System.out.println("###################################");
        System.out.println("Checking multiple elements if they contain in the array list by using containsAll method:");
        // Checking multiple elements if they are contain in the array list
        System.out.println(states.containsAll(List.of("Virginia","Ohio","Illinois")));


        System.out.println();
        System.out.println("###################################");
        System.out.println("Adding null value into the array list:");
        // Adding null value into the array list
        states.add(null);
    /*    states.add(null);
        states.add(null);*/


       /* states.remove(null);
        List<String> deleteList = new ArrayList<>();
        deleteList.add(null);
        states.removeAll(deleteList);*/

        // Printing the all elements after adding null value into the array list
        iterator=states.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("###################################");
        System.out.println("Printing the elements in reverse order:");
        // Printing the element in reverse order using indexing from the array list
        ListIterator listIterator = states.listIterator(states.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // The list below cannot be changed because List.of() creates immutable list.
    List<String> statesList = List.of("Wisconsin", "Texas", "Virginia");
        //statesList.remove("Texas"); it cannot be done
        // statesList.add("Ohio"); it cannot be done
        for(String state : statesList){
            System.out.println(state);
        }

    }
}
