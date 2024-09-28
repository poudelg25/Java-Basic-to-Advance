package functionalinterface;
import java.util.function.BinaryOperator;

public class TriConsumerExample {

    public static void main(String[] args) {

    TriConsumer<String, String, String> triConsumer = (str1, str2, str3) -> {
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1.length());
        System.out.println(str2.toUpperCase());
        System.out.println(str3.toLowerCase());
        };

    triConsumer.accept("Hello", "World", "How are you?");
    triConsumer.test();

                // BinaryOperator to find the maximum of two numbers
                BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;

                // Applying the operator
                int result = max.apply(10, 20);

                // Output the result
                System.out.println("Max of 10 and 20: " + result);  // Outputs: Max of 10 and 20: 20


    }
}
