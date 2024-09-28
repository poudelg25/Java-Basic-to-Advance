package collection;

import oop.inheritance.Staff;
import java.util.HashMap;
import java.util.Map;

public class MapExampleWithObject {
    public static void main(String[] args){

        Map<Integer, Staff> staffMap = new HashMap<>();
        staffMap.put(3, new Staff(3, "Ram", 30, "HR", "Chicago", 5000d));
        staffMap.put(4, new Staff(4, "John", 28, "Supervisor", "Madison", 3000d));
        staffMap.put(5, new Staff(5, "Peter", 33, "Team Leader", "Springfield", 2500d) );

        // To get all the objects' information
        System.out.println("Printing object's key with all the information from the entry set:");
        for(Map.Entry<Integer, Staff> entry: staffMap.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
            // or
            //System.out.println(entry);
        }

        // To get age of each object from the entry set
        System.out.println();
        System.out.println("Printing object's key with its age from the entry set:");
        for(Map.Entry<Integer, Staff> entry: staffMap.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue().getAge());
        }
    }
}
