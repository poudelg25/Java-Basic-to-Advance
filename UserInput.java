import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number:");
        int firstNumber = scanner.nextInt();
        //System.out.println("You entered: "+firstNumber);

        System.out.print("Please enter second number:");
        int secondNumber = scanner.nextInt();
        //System.out.println("You entered: "+secondNumber);
        System.out.print("Sum of first and second number is:"+(firstNumber+secondNumber));
    }
}
