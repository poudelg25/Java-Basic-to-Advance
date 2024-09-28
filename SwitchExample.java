import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = sc.nextInt();

        switch(number){
            case 1:
                System.out.println("This is number 1");
                break;
            case 2:
                System.out.println("This is number 2");
                if(number % 2 == 0){
                    System.out.println("This is divisible by 2 so this is an even number");
                }
                break;
            case 3:
                System.out.println("This is number 3");
                break;
            case 4:
                System.out.println("This is number 4");
                break;
            default:
                System.out.println("out of bound number");
                break;
        }

    }
}
