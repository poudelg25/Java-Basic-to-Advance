package functionalinterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args){
        Supplier<String> supplier = ()-> "Hello world!";
        System.out.println(supplier.get());

        Supplier<Integer> supplier1 = () -> 4*4;
        System.out.println(supplier1.get());

        Supplier<Boolean> supplier2 = () -> 7 % 2 ==0;
        System.out.println(supplier2.get());

    }
}
