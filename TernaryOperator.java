import java.util.Scanner;

public class TernaryOperator {

    public static String checkPositiveOrNegative(int num){
        return (num > 0 ? "positive" : num < 0 ? "negative" : "neither positive nor negative");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        /*if(num%2==0) {
            System.out.println(num+" is even");
        } else{
            System.out.println(num+" is odd");
        }*/

        //Ternary operator or conditional operator
        //result = condition ? true_expression : false_expression
        System.out.println(num+" is "+(num%2==0 ? "even": "odd"));

   /*     String result = (num > 0 ? "positive" : num < 0? "negative" : "neither positive nor negative!!");
        System.out.println(num+" is "+result);*/

        String result =checkPositiveOrNegative(num);
        System.out.println(num+" is "+result);


    }
}
