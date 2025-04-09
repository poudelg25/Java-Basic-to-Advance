package variablescope;

public class InstanceVariableExample {
    String name;
    int age;
    public InstanceVariableExample(){
        System.out.println(name); // String name is accessible inside constructor
        System.out.println(age); // int age is accessible inside constructor
    }
    public static void main(String[] args){
        new InstanceVariableExample();
    }

    public String getName() {
        return name; // String name is accessible inside method
    }

    public void setName(String name) {
        this.name = name; // String name is accessible inside method
    }

    public int getAge() {
        return age; // int age is accessible inside method
    }

    public void setAge(int age) {
        this.age = age; // int age is accessible inside method
    }
}
