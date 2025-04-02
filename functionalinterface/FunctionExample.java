package functionalinterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args){

        Function<String, String> function = (str1)-> str1.toUpperCase();
        // or Function<String, String> function = String::toUpperCase;
        // String::toUpperCase (is called method reference).

        System.out.println(function.apply("Hello World!"));

        Function<Integer, Integer> integerFunction = num1 -> num1 * num1;

        System.out.println("Square of the given number is " +integerFunction.apply(6));
    }
}
