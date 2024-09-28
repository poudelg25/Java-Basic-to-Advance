package oop.polymorphism;

public class MethodOverLoading {
    public static void main(String[] args){
        int sum = addNumbers();
        System.out.println("Sum is: "+sum);

        int sum2 = addNumbers(20, 30);
        System.out.println("Sum is: "+sum2);

        addNumbers(7.0, 5);

    }

    public static int addNumbers(){ // same method name but no input parameters
        int num1=50;
        int num2=40;
        return num1+num2;
    }

    public static int addNumbers(int num1, int num2){ // same method name but two input parameters
        return num1+num2;
    }

    public static void addNumbers(double num1, int num2){ // same method name but input data types are different
        double sum=num1+num2;
        System.out.println("Sum is: "+sum);
    }
}
