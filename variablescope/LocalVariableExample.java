package variablescope;

public class LocalVariableExample {

    public LocalVariableExample() {
        int num = 7;
        System.out.println("Local variable inside constructor: " + num);
    }

    public static void main(String[] args) {
        test();
        //System.out.println(info); //String info is only accessible inside test() method
        //System.out.println(num); //int num is only accessible inside LocalVariableExample() constructor
    }

    public static void test() {
        String info = "Local variable inside test method";
        System.out.println(info);
        if (true) {
            String ifBlock = "Local variable inside if block";
        }
        //System.out.println(ifBlock); // String ifBlock is only accessible inside if block
    }

    public static void print() {
        // System.out.println(info); //String info only accessible inside test() method
    }

}
