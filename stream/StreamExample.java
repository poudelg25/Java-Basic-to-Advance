package stream;

import java.util.*;
import java.util.stream.Collectors;

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

        // Using forEach Terminal Operation, Printing each state from states list
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
        states.stream().sorted(Collections.reverseOrder()).forEach(state-> System.out.println(state));
        // or states.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

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


        //Using method chaining, we can use multiple Intermediate operations in stream to get the desired output
        System.out.println("###################");
        System.out.println("Printing the first 4 distinct states in uppercase and sorted order: ");
        states.stream().distinct().sorted().limit(4).map(state->state.toUpperCase()).forEach(state-> System.out.println(state));
        // or states.stream().distinct().sorted().limit(4).map(String::toUpperCase).forEach(System.out::println);


        // Using collect terminal operation, collection elements to a new list
        System.out.println("####################");
        System.out.println("Creating a new list using collect terminal operation and printing each element from the new list:");
        List<String> newList = states.stream().collect(Collectors.toList());
        // or List<String> newList = states.stream().toList();
        newList.forEach(System.out::println);


        // Using forEach Terminal Operation, Printing each state from states list
        System.out.println("##################");
        System.out.println("Printing each state name using forEach Terminal operation:");
        states.forEach(state-> System.out.println(state));
        // or states.forEach(System.out::println);


        // Using reduce Terminal Operation, Printing all states by concatenating from the states list
        System.out.println("###################");
        System.out.println("Printing all states in a single line by concatenating using reduce Terminal Operation: ");
        String concatenatedStates = states.stream().reduce(" ", (a, b)-> a +" "+b);
        System.out.println(concatenatedStates);


        //Using min Terminal Operation, Printing the minimum state with natural order
        System.out.println("################");
        System.out.println("Printing the minimum states with natural order: ");
        String minStates = states.stream().min(String::compareTo).get();
        System.out.println(minStates);


        //Using max Terminal Operation, Printing the maximum state with natural order
        System.out.println("################");
        System.out.println("Printing the maximum states with natural order: ");
        String maxStates = states.stream().max(String::compareTo).get();
        System.out.println(maxStates);

        //Using findFirst Terminal Operation, Printing the first state with specific search
        System.out.println("################");
        System.out.println("Printing the first state starts with 'W': ");
        String findFirstState = states.stream().filter(state-> state.startsWith("W")).findFirst().get();
        System.out.println(findFirstState);

        //Using findAny Terminal Operation, Printing any state with specific search
        System.out.println("################");
        System.out.println("Printing the any state starts with 'W': ");
        String findAnyState = states.stream().filter(state-> state.startsWith("W")).findAny().get();
        System.out.println(findAnyState);


        //Using anyMatch Terminal Operation, Checking if the specific search matched to any elements of the list
        System.out.println("################");
        System.out.println("Checking if there is any state starts with 'W': ");
        boolean anyMatch = states.stream().anyMatch(state -> state.startsWith("W"));
        System.out.println(anyMatch);

        //Using allMatch Terminal Operation, Checking if the specific search matched to all elements of the list
        System.out.println("################");
        System.out.println("Checking if there are all states starts with 'W': ");
        boolean allMatch = states.stream().allMatch(state -> state.startsWith("W"));
        System.out.println(allMatch);

        //Using noneMatch Terminal Operation, Checking if the specific search does not match to all/any elements of the list
        System.out.println("################");
        System.out.println("Checking if there are no states starts with 'W': ");
        boolean noneMatch = states.stream().noneMatch(state -> state.startsWith("W"));
        System.out.println(noneMatch);

        // Using count() Terminal Operation, counting total number of elements in the list
        System.out.println("#########################");
        System.out.println("Printing/Counting total number of states in the list");
        Long countStates = states.stream().count();
        System.out.println(countStates);
    }
}
