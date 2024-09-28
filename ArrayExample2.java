import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {

        int[] numbers = {6, 2, 9, 23, 6, 7, 2, 23, 65, 0};

        System.out.print("Enter a number to find into the array: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == userInput) {
                System.out.println("Entered number: " + userInput + " is found into the array!!");
                System.out.println("Entered number is in: " + i + " index of the array!!");
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Entered number could not found into the array!!");
        }
    }
}
