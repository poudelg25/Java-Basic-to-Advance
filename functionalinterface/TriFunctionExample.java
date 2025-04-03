package functionalinterface;

public class TriFunctionExample {
    public static void main(String[] args){
        TriFunction<String, String, String, String> triFunction =
                (str1, str2, str3)-> str1.concat(str2).concat(str3).toUpperCase();
        System.out.println(triFunction.apply("Hello ", "World, ", "How are you?"));

        TriFunction<Integer, Integer, Integer, Integer> integerTriFunction = (num1, num2, num3) -> num1*num2*num3;
        System.out.println("Product of three numbers: "+integerTriFunction.apply(3,4,5));

        triFunction.test();
    }
}
