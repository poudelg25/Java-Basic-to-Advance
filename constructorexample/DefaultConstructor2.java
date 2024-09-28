package constructorexample;

public class DefaultConstructor2 extends DefaultConstructor{

    String address;
    int age;
    public DefaultConstructor2(String address, int age){
        super("Ram");
        this.address=address;
        this.age=age;
        System.out.println("This is default constructor2 with parameter!!!");
    }
    public DefaultConstructor2(){
    }
    public static void main(String[] args){

        DefaultConstructor2 defaultConstructor2 = new DefaultConstructor2("Chicago", 45);

        System.out.println(defaultConstructor2.name);
    }
}
