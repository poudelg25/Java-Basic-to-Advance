package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExceptionExample {
    public static void main(String[] args){

        //ThrowsExceptionExample.readFile(); // or readFile();

       try {
            ThrowsExceptionExample.readFile(); // or readFile();
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch(IOException ex){
           ex.printStackTrace();
           System.out.println(ex.getMessage());
       }

    }
    public static void readFile() throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader("C/Users/GP/Desktop/test.txt");
        fileReader.read();

        /*try {
            FileReader fileReader = new FileReader("C/Users/GP/Desktop/test.txt");
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }*/
    }
}
