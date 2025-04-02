package functionalinterface;

public class TriPredicateExample {
    public static void main(String[] args){
        TriPredicate<String, String, String> triPredicate = (str1, str2, str3) -> str1.concat(str2).equals(str3);
        System.out.println(triPredicate.test("clock", "wise", "clockwise"));

        TriPredicate<Integer, Integer, Integer> triPredicate1 = (num1, num2, num3) -> (num1 + num2) == num3;
        System.out.println(triPredicate1.test(3, 4, 10));

        triPredicate.test();
    }
}
