package wrapper;

public class WrapperClassExample {
    public static void main(String[] args){

        int num = 5;

        // Boxing example - (Converting primitive data type to wrapper class object)
        System.out.println("###############");
        System.out.print("Boxing example (Converting 'int' to 'Integer'):");
        Integer wrapNum = Integer.valueOf(num); //boxing
        System.out.println(wrapNum);

        // Autoboxing example - (java automatically converts primitive data type to wrapper class object)
        System.out.println("###############");
        System.out.print("Autoboxing example (java automatically converts 'int' to 'Integer'):");
        Integer wrapNum2 = num; //auto-boxing
        System.out.println(wrapNum2);

        // Unboxing example - (Converting wrapper class object to primitive data type)
        System.out.println("###############");
        System.out.print("Unboxing example (Converting Integer to int):");
        Double dnum = 7.0;
        double dValue = dnum.doubleValue(); //unboxing
        System.out.println(dValue);

        //Auto Unboxing example - (java Automatically converts wrapper class object to primitive data type)
        System.out.println("###############");
        System.out.print("Auto Unboxing example (java Automatically converts Integer to int):");
        Integer wrapNum3 = 8;
        int priNum = wrapNum3; //auto-unboxing
        System.out.println(priNum);
    }
}
