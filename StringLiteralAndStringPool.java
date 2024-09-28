public class StringLiteralAndStringPool {
    public static void main(String[] args){
        //1. Using String Literal
        String programmingLanguage = "Java";
        String programmingLanguage2 = "Java";
        String pLanguage = "Java";

        String pLanguage2 = "Python";

        //2. Using new keyword
        String pLanguage3 = new String("Java");
        String pLanguage4 = new String("Java");
        String pLanguage5 = new String("Java");
    }
}
