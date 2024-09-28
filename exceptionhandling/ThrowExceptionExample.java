package exceptionhandling;

import java.util.Scanner;

public class ThrowExceptionExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = sc.nextByte();

        if(age<18) {
            try {
                throw new InvalidVoterException("You are not eligible to vote!!");
            } catch (InvalidVoterException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("You are eligible to vote!!");
        }
    }
}
