package functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (str1, str2) -> str1.concat(" "+str2).toUpperCase();
        System.out.println(biFunction.apply("hello", "world!"));

        BiFunction<Integer, Integer, Integer> integerBiFunction = (num1, num2) -> (num1 + num2);
        // or BiFunction<Integer, Integer, Integer> integerBiFunction = Integer::sum;

        System.out.println("Sum of two integers: "+integerBiFunction.apply(7, 9));

    }
}
