package functionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceExample {

    public void test(); // single abstract method


    //Concrete methods - A method that has complete implementation
    default  void display(){
        System.out.println("This is a display method");
    }

    default  void calculate(){
        System.out.println("This is a calculate method");
    }
}
