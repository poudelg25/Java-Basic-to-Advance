import java.util.Scanner;

public class BreakUsesInLoop {
    public static void main(String[] args){

        int[] numbers = {4, 7, 2, 8, 0, 5, 8, 1, 9, 3, 2, 7, 5, 1};

        System.out.print("Please enter a number to search: ");
        Scanner sc = new Scanner(System.in);
        int searchNumber = sc.nextInt();

        for(int num: numbers){
            System.out.println(num);
            if(searchNumber == num){
                System.out.println("Number "+num+ " found!!");
                break; //terminate the loop
            }
        }
    }
}
