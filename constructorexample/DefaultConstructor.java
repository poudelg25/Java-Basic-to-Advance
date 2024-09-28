package constructorexample;

public class DefaultConstructor {
    String name;

    public DefaultConstructor(){
        System.out.println("Inside the default constructor.");
    }

    public DefaultConstructor(String name){
        this.name=name;
        System.out.println("Inside the Default Constructor with parameter!!!");
    }

    public static void main(String[] args){
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        System.out.println(defaultConstructor.name);
    }
}
