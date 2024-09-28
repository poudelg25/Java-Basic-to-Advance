package oop;

public class StudentTest {
    String name;
    static Student student; // we can access data type Student here because of access modifier
    // above, Student is a data type and student is a variable name
    public static void main(String[] args){
            student.displayDetails(); // data type Student must be static to access student here
    }
}
