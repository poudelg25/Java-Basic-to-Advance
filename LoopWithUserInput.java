import java.util.Scanner;

public class LoopWithUserInput {
    public static void main(String[] args){

        System.out.print("Please enter the number of times you want to print: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i=1; i<=count; i++){
           System.out.println("Hello World "+i);
        }
    }
}
