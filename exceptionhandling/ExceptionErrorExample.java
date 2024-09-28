package exceptionhandling;

public class ExceptionErrorExample {
    public static void main(String[] args) {
        System.out.println("Program started.......");
        //System.out.println("First Result is: " + (25 / 5));

        //System.out.println("Second Result is: " + (25 / 0));

        int[] nums = {5, 6};
        //nums[2]=7; // initializing value 7 at index 2 of the array

        String str = null;
        try {
            //Error prone code
           System.out.println(nums[2]);// printing the value of index 2 of the array
            //System.out.println("Second Result is: " + (25 / 0));
            //System.out.println(str.length());

        }
        //catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Inside Catch block.");
            System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println(e.getClass().getName());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurred..");
        }
        catch(Exception e){
            //System.out.println(e.getMessage());
            System.out.println("Something unknown error occurred..");
        }
        finally {
            System.out.println("Finally block executed....");
        }
        System.out.println("Program ended.....");
    }
}
