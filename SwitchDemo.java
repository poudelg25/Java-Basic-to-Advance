import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of the week(1-7): ");
        byte day = sc.nextByte();
        sc.close();
        switch (day) { // if(day == 1 or 2 or 3 or 4 ..... go to case 1 or 2....)
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day, please enter valid value from 1-7!!");
                break;
        }

        System.out.println("Exited switch block");
    }
}
