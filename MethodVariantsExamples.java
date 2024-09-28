public class MethodVariantsExamples {
    public static void main(String[] args){
        display();
        sum(4, 7);
        String result = result();
        System.out.println("This is a: " +result);

        int square = square(5);
        System.out.println("The square result is: "+ square);

    }
    // Method with no returning value and no parameters
    public static void display(){
        System.out.println("Method with no returning value and no parameters.");
    }

    // Method with no returning value and having parameters
    public static void sum(int a, int b){
        System.out.println("Sum of the two numbers is: "+(a+b));
    }

    //Method with returning value and having no input parameters
    public static String result(){
        return "Method with returning value as string and no parameters";
    }

    // Method with returning value and having input parameters
    public static int square(int n){
        return n*n;
    }
}
