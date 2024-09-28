public class ArithmeticOperators {
    public static void main(String args[]){
        byte num1;
        byte num2;
         num1 = 10;
         num2 = 20;

         byte sum = (byte)(num1 + num2); //type casting
         System.out.println("The sum of two numbers is: " + sum);

         // If variable type is same, then we can declare many variable of same type in a single statement
        byte num3, num4, num5;

        int num6 = 20;
        int num7 = 40;

        System.out.println("Sum is: "+(num6 + num7));
        System.out.println("Difference is: " + (num7 - num6));
        System.out.println("Product is: " + (num6 * num7));
        System.out.println("Division is: " + (num7 / num6));
        System.out.println("Remainder is: " + (num7 % num6));
    }
}
