package functionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args){

        BiConsumer<String, String> biConsumer = (str1, str2)-> {
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str1.toUpperCase());
            System.out.println(str2.toLowerCase());};

        biConsumer.accept("Hello", "WORLD");
    }
}
