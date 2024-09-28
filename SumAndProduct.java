import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        int a, b, sum=0, product=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();

        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        sc.close();

        sum=a+b;
        product=a*b;
        System.out.println("The sum is: "+sum);
        System.out.println("The product is: "+product);
    }
}
