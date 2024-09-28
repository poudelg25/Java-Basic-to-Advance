import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args){

        System.out.print("Please enter number of subjects: ");
        Scanner sc = new Scanner(System.in);
        byte noOfSubjects = sc.nextByte();
        float[] marks = new float[noOfSubjects];


        for(byte i=1; i<=noOfSubjects; i++){
            System.out.print("Please enter the mark for subject "+i+": ");
            marks[i-1] = sc.nextFloat();
        }

        System.out.println();
        System.out.println("######################");
        System.out.println("Your Marks are: ");
        float total=0;
        for(float mark: marks){
            System.out.println(mark);
            total += mark;
        }

        float percentage = (total/(noOfSubjects*100)*100);
        System.out.println();
        System.out.println("######################");
        System.out.println("Your total marks is: "+total);
        System.out.println("Your total percentage is: "+percentage+"%");

        System.out.println();
        System.out.println("######################");
        if(percentage>= 80){
            System.out.println("Congratulation!! You got distinction.");
        } else if(percentage>=60){
            System.out.println("Congratulations!! You got first division.");
        } else if(percentage>=45){
            System.out.println("Congratulations!! You got second division.");
        } else if(percentage>=32){
            System.out.println("Congratulation!! You got third division.");
        } else {
            System.out.println("Sorry!! you failed!!");
        }
    }
}
