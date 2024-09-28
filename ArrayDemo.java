public class ArrayDemo {
    public static void main(String[] args){

      /*  // Array declaration with its datatype and variable name
        String[] names;

        // Array instantiation
        names = new String[4];*/

        // Array declaration and instantiation
        //String []names = new String[4];
        //String names[] = new String[4];
        String[] names = new String[4];

        // Value initialization
        names[0] ="Ram";
        names[1] ="Hari";
        names[2] ="Sita";
        names[3] = "Rajee";

        System.out.println(names[2]);

        for(String name: names){
            System.out.println(name);
        }

    }
}
