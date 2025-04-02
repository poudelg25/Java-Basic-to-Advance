package functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args){
        Predicate<String> predicate = str1 -> str1.contains("n");
        System.out.println(predicate.test("Japan"));

        Predicate<Integer> predicate1 = num1 -> num1 % 2 == 0;
        System.out.println(predicate1.test(5));
    }
}
