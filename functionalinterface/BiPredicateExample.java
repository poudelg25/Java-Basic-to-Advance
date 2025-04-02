package functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args){
        BiPredicate<String, String> biPredicate = (str1, str2) -> str1.equals(str2);
        //or BiPredicate<String, String> biPredicate = String::equals;
        System.out.println(biPredicate.test("Nepal", "nepal"));
        System.out.println(biPredicate.test("USA", "USA"));

        BiPredicate<Integer, Integer> integerBiPredicate = (num1, num2) -> (num1 - num2) > 0;

        System.out.println(integerBiPredicate.test(6, 4));
    }
}
