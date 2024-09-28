import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Your name is: " +name);

        System.out.print("\nEnter your gender(M/F): ");
        char gender = sc.next().charAt(0); //This will always take the first character
        System.out.println("Your gender is: " + gender);

        sc.close();
    }
}
