package stream;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){

        // Example where null pointer exception may occur
        String name = null; //it does not point to any memory location
        //System.out.println(name.length());

        // Another example where null pointer exception may occur
        Employee employee = null;
        //System.out.println(employee.getDepartment());

        // Traditional way of handling null pointer exception for String lastName
        String lastName = null;
        System.out.println("###########");
        System.out.println("Checking if lastName is null: ");
        if(lastName != null) {
            System.out.println(lastName.length());
        }

        // Traditional way of handling null pointer exception for employee1 object
            Employee employee1 = null;
        System.out.println("###########");
        System.out.println("Checking if employee1 is null: ");
                    if(employee1 != null){
                        System.out.println(employee1.getDepartment());}


        // Example of using Optional container class
        System.out.println("###########");
        System.out.println("Creating an Optional with a value 'Illinois':");
            Optional<String> state = Optional.of("Illinois");
            //Optional<String> state = Optional.of(null); // Does not support null here, it throws NullPointerException
            //Optional<String> state = Optional.ofNullable(null); // Supports null with ofNullable() method
            //Optional<String> state = Optional.empty(); // Creating an empty Optional (no value present)

        System.out.println("###########");
        System.out.print("Checking if the state value is present: ");
        if(state.isPresent()){ //returns true if value is present otherwise false
                        System.out.println(state.get()); // returns the value if present
                    } else {
                        System.out.println("Value is not present!!");
                    }

        // Example of using Optional container class and how it is handling NullPointerException
        System.out.println("###########");
        System.out.println("Creating an empty Optional:");
        Optional<String> location = Optional.ofNullable(null);
        // or Optional<String> location = Optional.empty();
        System.out.print("Getting value or returning default if absent: ");
        System.out.println(location.orElse("N/A"));
        //returns value if present, otherwise returns the specified value inside orElse


        // Optional can be used with stream operations

        //Finding state that starts with 'I'
        System.out.println("###########");
        System.out.print("Finding state that starts with 'I': ");
        System.out.println(state.filter(st-> st.startsWith("I")));
        //This will return an Optional containing the result if a state starts with 'I'

        // Returning the exact value using .get() method (if a value is present)
        System.out.println("###########");
        System.out.print("Getting the state that starts with 'I' using .get(): ");
        System.out.println(state.filter(st-> st.startsWith("I")).get());
        //This will return a value if present (be careful: will throw NullPointerException if empty)

        // Finding state that starts with 'V' (if none found optional will be empty)
        System.out.println("###########");
        System.out.print("Finding state that starts with 'V' (this will be empty): ");
        System.out.println(state.filter(st-> st.startsWith("V")));
        // This will return an empty optional because there is no state starts with 'V'

        //Using .get() method on empty Optional
        System.out.println("###########");
        System.out.println("Using .get() on an empty Optional will throw NullPointerException or NoSuchElementException.");
        //System.out.println(state.filter(st-> st.startsWith("V")).get());
        // This will throw NullPointerException because the optional is empty
    }
}
