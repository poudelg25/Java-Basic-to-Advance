package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample {
    public static void main(String[] args){
        List<String> states = new ArrayList<>();
        states.add("Virgina");
        states.add("Texas");
        states.add("Ohio");
        states.add("Wisconsin");
        states.add("Illinois");
        states.add("Vermont");
        states.add("Ohio");
        states.add("Wisconsin");
        states.add("Michigan");
        states.add("Washington");

        // Printing each state from states list
        System.out.println("Printing each state name:");
        states.forEach(System.out::println);

        //Using Map intermediate operation in stream, printing each state in upper case
        System.out.println("#################");
        System.out.println("Printing each state in upper case:");
        states.stream().map(state->state.toUpperCase()).forEach(state-> System.out.println(state));
        // or states.stream().map(String::toUpperCase).forEach(System.out::println);


        // Using Map Intermediate Operation in stream, finding length of each state name
        System.out.println("#####################");
        System.out.println("Printing the length of each state name: ");
        states.stream().map(state-> state.length()).forEach(state-> System.out.println(state));
        //or states.stream().map(String::length).forEach(System.out::println);


        //Using Filter intermediate operation in stream, printing each state starts with "v"
        System.out.println("#################");
        System.out.println("Printing each state starts with v:");
        states.stream().filter(state->state.startsWith("V")).forEach(state-> System.out.println(state));
        // or states.stream().filter(state->state.startsWith("V")).forEach(System.out::println);


        //Using Filter Intermediate Operation in stream, printing each state ends with "n"
        System.out.println("#################");
        System.out.println("Printing each state ends with n:");
        states.stream().filter(state->state.endsWith("n")).forEach(state-> System.out.println(state));
        // or states.stream().filter(state->state.endsWith("n")).forEach(System.out::println);

        // Using Sorted Intermediate Operation in stream, printing the state names in natural order(Ascending Order)
        System.out.println("#####################");
        System.out.println("Printing state names in natural order(sorted order): ");
        states.stream().sorted().forEach(state-> System.out.println(state));
        //or states.stream().sorted().forEach(System.out::println);

        // Using Sorted Intermediate Operation in stream, printing the state names in reversed order(descending order)
        System.out.println("#####################");
        System.out.println("Printing state names in reverse order(descending order): ");
        states.stream().sorted(Comparator.reverseOrder()).forEach(state-> System.out.println(state));
        // or states.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // Using Distinct Intermediate Operation in stream, printing the distinct state names
        System.out.println("#####################");
        System.out.println("Printing distinct state names: ");
        states.stream().distinct().forEach(state-> System.out.println(state));
        //or  states.stream().distinct().forEach(System.out::println);

        // Using Limit intermediate operation in stream, limiting the number of elements to be chosen
        System.out.println("#####################");
        System.out.println("Printing the state names from the list by limiting particular number(4): ");
        states.stream().limit(4).forEach(state-> System.out.println(state));
        // or states.stream().limit(4).forEach(System.out::println);


        // Using Skip Intermediate Operation in stream, skipping first 5 states name and printing the remaining state name
        System.out.println("#####################");
        System.out.println("Skipping first 5 states name and Printing the remaining state name: ");
        states.stream().skip(5).forEach(state-> System.out.println(state));
        //or states.stream().skip(5).forEach(System.out::println);

    }
}
