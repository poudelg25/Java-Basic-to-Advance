package variablescope;

public class ClassVariableExample {
    static String classVariable = "class variable";

    public static void main(String[] args){
        System.out.println("Inside main method: "+classVariable); // accessible inside main method without creating class object
        display();
    }

    public static void display(){
        System.out.println("Inside display method: "+classVariable); //accessible inside method
    }
}
