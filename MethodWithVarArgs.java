public class MethodWithVarArgs {
    public static void main(String[] args){

        System.out.println("Sum of number 0 is: "+sum());
        System.out.println("Sum of number 1 is: "+sum(1));
        System.out.println("Sum of number 1 and 2 is: "+sum(1, 2));
        System.out.println("Sum of number 1, 2, and 3 is: "+sum(1, 2, 3));
    }


    public static int sum(int...numbers){
        int sum =0;
        for(int number: numbers){
            sum+=number;
        }
        return sum;
    }

    // another example of varargs or variable length arguments
    public static void example(int a, double b, String name, int[] values, int...numbers){
    }
}
