import java.util.Scanner;

public class ArrayExample3 {
    public static void main(String[] args) {

        String[] names = {"Gopal", "Hari", "Gita", "Ram", "Sandy", "Ashok"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = sc.next(); // This will only take first word from user input

        int index = -1;
        for (var i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(firstName)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("First name: " + firstName + " found at index: " + index);
        } else {
            System.out.println("First name could not found!!");
        }

        /*//Enhanced for loop example
        int index = -1;
        int newIndex = 0;
        for (String name : names) { //(for each name such that names)
            if (name.equalsIgnoreCase(firstName)) {
                index = newIndex;
                break;
            }
            newIndex++;
        }
        if (index != -1) {
            System.out.println("First name " + firstName + " found at index: " + index);
        } else {
            System.out.println("First name could not found!!");
        }*/
    }
}
