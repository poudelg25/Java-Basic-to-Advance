
public class StringMethods {
    public static void main(String[] args){

        String state = "Illinois";
        String city = "Chicago";
        String state2 = "  Texas";
        String state3 = " ";
        String state4 = "West Virginia In Virginia";

        System.out.println(state);

        System.out.println(state.toUpperCase());
        System.out.println(state.toLowerCase());
        System.out.println(state.length());
        System.out.println(state.charAt(0));
        System.out.println(state+", "+city);
        System.out.println(state.concat(", ").concat(city));
        System.out.println(state.startsWith("Il"));
        System.out.println(state.startsWith("il"));
        System.out.println(state.endsWith("Is"));
        System.out.println(state.endsWith("is"));
        System.out.println(state.indexOf("i"));
        System.out.println(state.lastIndexOf("i"));
        System.out.println(state.indexOf("oi"));
        System.out.println(state.equals("Illinois"));
        System.out.println(state.equalsIgnoreCase("illiNois"));
        System.out.println(state.substring(3)); // here it includes index 3 up to the last index
        System.out.println(state.substring(2, 5)); // here, it includes index 2 but not index 5
        System.out.println(state2.trim()); // This will remove only leading and trailing spaces of the String, but it will not remove the spaces between the String.
        System.out.println(state3.isEmpty()); // It only checks if the length is zero. For example, if there is only spaces, then it will count the length.
        System.out.println(state3.isBlank()); //It checks if it only contains white spaces.
        System.out.println(state.contains("no")); //It checks if the state contains "no" in the String.
        System.out.println(state.repeat(5));// it will print the state name 5 times
        System.out.println(state.replace('i', 'I'));//It will replace i with I and print the whole String after replacing.
        System.out.println(state.replaceFirst("i", "I")); // It will replace first "i" in the string with "I".
        System.out.println(state.replace("lli", "MMI")); // It will replace "lli" with "MMI" in the string "Illinois".

        String[] words = state4.split(" "); // This will split the words by space in the string and put it into the array
        for(String word: words){
            System.out.println(word);
        }


    }
}
