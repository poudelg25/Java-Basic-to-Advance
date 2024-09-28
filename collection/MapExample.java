package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){

    Map<String, String> countryCapital = new HashMap<>();

        // Adding key value pairs into the HashMap
        countryCapital.put("Nepal", "Kathmandu");
        countryCapital.put("India", "New Delhi");
        countryCapital.put("Bangladesh", "Dhaka");
        countryCapital.put("USA", "Washington DC");

        Iterator<Map.Entry<String, String>> iterator = countryCapital.entrySet().iterator();

        // Printing key value pairs of the HashMap using iterator
        System.out.println("Printing key value pairs of the HashMap using iterator:");
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey()+" = "+entry.getValue());
            // or
            // System.out.println(entry);
        }

        // Printing key value pairs of the HashMap using enhanced for-each loop
        System.out.println();
        System.out.println("######################");
        System.out.println("Printing key value pairs of the HashMap using enhanced for-each loop:");
        for(Map.Entry<String , String> entry: countryCapital.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
            // or
            // System.out.println(entry);
        }

        Map<String, String> additionalCountryCapital = new HashMap<>();
        additionalCountryCapital.put("Spain", "Barcelona");
        additionalCountryCapital.put("Portugal", "Lisbon");
        additionalCountryCapital.put("France", "Paris");

        //Adding multiple (list of) key value pairs into the HashMap
        countryCapital.putAll(additionalCountryCapital);

        System.out.println();
        System.out.println("######################");
        System.out.println("Printing key value pairs of the HashMap after adding multiple entries:");
        for(Map.Entry<String, String> entry: countryCapital.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
            // or
            // System.out.println(entry);
        }

        // To find the size of the HashMap entrySet
        System.out.println();
        System.out.println("######################");
        System.out.println("Finding the size of the HashMap entrySet:");
        System.out.println(countryCapital.size());

        // To check if the HashMap entry set is empty
        System.out.println();
        System.out.println("######################");
        System.out.println("Checking if the HashMap entry set is empty:");
        System.out.println(countryCapital.isEmpty());

        //To check if the key contains into the entry set
        System.out.println();
        System.out.println("###########################");
        System.out.println("Checking if a particular key contains in the entry set:");
        System.out.println(countryCapital.containsKey("Nepal")); // it returns boolean value as true or false


        //To check if a particular value contains into the entry set
        System.out.println();
        System.out.println("###########################");
        System.out.println("Checking if the particular value contains into the entry set:");
        System.out.println(countryCapital.containsValue("Dhaka"));


        //To get the value of from the entry set using key
        System.out.println();
        System.out.println("###########################");
        System.out.println("Getting a particular value using key from the entry set:");
        System.out.println(countryCapital.get("Nepal"));


        //To get all the keys from the entry set
        System.out.println();
        System.out.println("###########################");
        System.out.println("Getting all the keys from the entry set:");
        System.out.println(countryCapital.keySet());

        // To update the value into the entry set
        System.out.println();
        System.out.println("############################");
        countryCapital.put("USA", "DC");
        System.out.println(countryCapital.get("USA"));

        // To get all the values from the entry set
        System.out.println();
        System.out.println("##########################");
        System.out.println("Getting all the values from the entry set:");
        System.out.println(countryCapital.values());

        // To remove a particular key with its value from the entry set
        System.out.println();
        System.out.println("###########################");
        System.out.println("Removing a particular key with its value from the entry set");
        countryCapital.remove("Spain");
        countryCapital.remove("India", "New Delhi");
        for(Map.Entry<String, String> entry: countryCapital.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
            // or
            // System.out.println(entry);
        }
    }
}
