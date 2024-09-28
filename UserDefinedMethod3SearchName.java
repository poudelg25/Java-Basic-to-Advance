import java.util.Scanner;

public class UserDefinedMethod3SearchName {
    public static void main(String[] args){

        String[] names = {"Gita", "Ram", "Hari", "Sita", "Shyam", "Rajesh"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the name you want to search: ");
        String findName = sc.next();

        nameSearch(names, findName);
    }

    public static void nameSearch(String[] nameList, String searchToName){
        boolean isFound = false;
        for(String name: nameList){
            if(name.equalsIgnoreCase(searchToName)){
                isFound = true;
            }
        }
        if(isFound){
            System.out.println(searchToName.toUpperCase()+" is found!!");
        } else{
            System.out.println(searchToName+" is not found!!");
        }
    }
}
