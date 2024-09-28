package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class ConsumerExample {
    public static void main(String[] args){

        Consumer<String> consumer = str-> {System.out.println(str);
            System.out.println(str.toUpperCase());
            System.out.println(str.length());};

        consumer.accept("This is consumer example.");

    }
// The method below accept works similar of functional interface (Consumer) with lambda expression
   /* void accept(String txt){
        System.out.println(txt);
        System.out.println(txt.toUpperCase());
        System.out.println(txt.length());
    }*/
}
