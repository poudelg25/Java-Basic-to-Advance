package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountAndPrintCharactersFromTheString {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string value: ");
        String value = sc.next();

        Map<Character, Integer> charValue = new HashMap<>();
        for(Character cha: value.toCharArray()){
            if(!charValue.containsKey(cha)) {
                charValue.put(cha, 1);
                //System.out.println(cha);
            } else{
                charValue.put(cha, charValue.get(cha)+1);
            }
        }

        // Printing key with its value from the entry set or printing count of each character in a string
        System.out.println();
        System.out.println("##################");
        System.out.println("Printing key with its value from the entry set:");
        for(Map.Entry<Character, Integer> entry: charValue.entrySet()){
            System.out.println(entry);
        }
    }
}
