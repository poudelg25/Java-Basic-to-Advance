package collection;

import oop.inheritance.Staff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaffList {
    public static void main(String[] args){

        List<Staff> staffList=new ArrayList<>();
        // Creating a Staff object with constructor
        Staff staff = new Staff(3, "Ram", 30, "HR", "Chicago", 5000d);
        staffList.add(staff);
        // adding a new staff object directly without creating temporary variable
        staffList.add(new Staff(4, "John", 28, "Supervisor", "Madison", 3000d));
        staffList.add(new Staff(5, "Peter", 33, "Team Leader", "Springfield", 2500d));


        //Printing a particular staff object using index.
        // Must have toString method in Staff class to print the object(staffList) details,
        // otherwise it will just print the hash code
        System.out.println(staffList.get(0));

        //Printing all staff objects using Iterator.
        // Must have toString method in Staff class to print the object(staffList) details,
        // otherwise it will just print the hash code
        Iterator iterator=staffList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // To find the size of staffList
        System.out.println(staffList.size());

    }
}
