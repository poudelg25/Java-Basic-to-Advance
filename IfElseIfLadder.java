import java.util.Scanner;

public class IfElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage(%): ");
        float percentage = sc.nextFloat();

        if(percentage>=80){
            System.out.println("You got Distinction division, percent: "+percentage+" %");
        } else if (percentage>=60) {
            System.out.println("You got First division, percent: "+percentage+" %");
        } else if (percentage >= 45) {
            System.out.println("You got Second division, percent: "+percentage+" %");
        } else if (percentage >= 35) {
            System.out.println("You got Third division, percent: "+percentage+" %");
        } else{
            System.out.println("Failed!!, percentage: "+percentage+" %");
        }

    }
}
