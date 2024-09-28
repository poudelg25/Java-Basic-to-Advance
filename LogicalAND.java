import java.util.Scanner;

public class LogicalAND {
    public static void main(String[] args) {
        // 1. age >= 18 years
        // 2. must be in Nepal
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = sc.nextByte();

        System.out.print("Are you in Nepal?(Y/N): ");
        char isNepal = sc.next().toUpperCase().charAt(0);

        if(age >= 18 && isNepal == 'Y') {
            System.out.println("You are eligible to vote!!");
        } else{
            System.out.println("You are not eligible to vote!!");
        }


    }
}
