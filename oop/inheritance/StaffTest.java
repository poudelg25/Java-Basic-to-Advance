package oop.inheritance;

public class StaffTest {
    public static void main(String[] args){
        Staff staff = new Staff();
        System.out.println(staff.getName("Ram"));
        staff.setName("Gopal");
        staff.setAge(32);
        staff.setAddress("Chicago");
        staff.setId(5);
        staff.setPosition("Full-stack developer");
        staff.setSalary(60000d);

        System.out.println(staff.getName("test"));
        System.out.println(staff.getName("Sita"));
        System.out.println(staff.getName("Ram"));

        staff.displayDetails();

        System.out.println(staff.toString());
    }
}
