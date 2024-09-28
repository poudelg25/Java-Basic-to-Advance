import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        double accountBalance = 500;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if(amount > accountBalance){
            System.out.println("You have insufficient balance!!");
        } else {
            System.out.println("Please collect money: $"+amount);
            System.out.println("Your new balance is: $"+(accountBalance-amount));
        }
    }
}
