package oop;
class Department{

}

public class Student {
    // Fields/Properties
    static int studentCount; // static variable
    Integer rollNumber;
    String name;
    String address;
    String email;
    Integer age;
    int zipCode;


    // Methods/Behaviors
    public void displayDetails(){
        System.out.println("Full name is: "+this.name);
        System.out.println("Address is: "+this.address);
        System.out.println("Email is: "+this.email);
        System.out.println("Roll no is: "+this.rollNumber);
        System.out.println("Zip code is: "+this.zipCode);
    }

    static void getNoOfStudent(){
        System.out.println(studentCount);
    }

    public void checkIfStudentIsPassed(){

    }
    // Default constructor
    public Student(){
        studentCount++;
    }

    // Another type of constructor which takes only two parameters.(Constructor overloading)
    public Student(Integer rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
        studentCount++;
    }


    // Creating Parameterized constructor
    public Student(Integer rollNumber, String name, String address, String email, Integer age, int zipCode){
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
        this.zipCode = zipCode;
        studentCount++;
    }

    public static void main(String[] args){
        //Object creation
        // Class_name object_name = new Class_name();
        Student student1 = new Student(); //constructor-> Student()

        // Object_name.field_name
        System.out.println("Full name is: "+student1.name);
        System.out.println("Address is: "+student1.address);
        System.out.println("Email is: "+student1.email);
        System.out.println("Roll no is: "+student1.rollNumber);
        System.out.println("Zip code is: "+student1.zipCode);

        //Object_name.method_name;
        student1.displayDetails();

        System.out.println();
        System.out.println("###################################");

        Student student2 = new Student();
        System.out.println(student1.zipCode);

        System.out.println();
        System.out.println("###################################");


        // If we want to set values of fields using default constructor
        student1.name = "Gopal";
        student1.address = "Chicago";
        student1.email = "gopal.poudel@gmail.com";
        student1.age = 33;
        student1.zipCode = 60660;


        System.out.println("Full name is: "+student1.name);
        System.out.println("Address is: "+student1.address);
        System.out.println("Email is: "+student1.email);
        System.out.println("Roll no is: "+student1.rollNumber);
        System.out.println("Zip code is: "+student1.zipCode);

        System.out.println();
        System.out.println("###################################");
        // parameterized constructor
        Student student3 = new Student(2, "Ram", "Wisconsin", "ram@gmail.com", 28, 53546);

        // Object_name.field_name
        System.out.println("Full name is: "+student3.name);
        System.out.println("Address is: "+student3.address);
        System.out.println("Email is: "+student3.email);
        System.out.println("Roll no is: "+student3.rollNumber);
        System.out.println("Zip code is: "+student3.zipCode);

        System.out.println();
        System.out.println("###################################");

        //Object_name.method_name;
        student1.displayDetails();

        System.out.println();
        System.out.println("###################################");

        System.out.println("No of students: "+studentCount);
    }
}


class Teacher{
}
class Employee{

}


