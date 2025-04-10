package variablescope;

public class TypeCastingExample {
    public static void main(String[] args){

        //(1) Widening Casting (Automatic) – Implicit Casting
        System.out.println("Example of Implicit/Widening/Automatic Casting:");
        int value = 10;
        double newValue = value; // 10 == 10.0 widening casting
        System.out.println(value);
        System.out.println(newValue);


        //(2) Narrowing Casting (Manual) – Explicit Casting
        System.out.println();
        System.out.println("###########");
        System.out.println("Example of explicit/Narrowing/manual casting: ");

        double dValue = 10.1;
        int newIntValue = (int)dValue; // 10.1 -> 10 Narrowing Casting (decimal part is lost)
        System.out.println(dValue);
        System.out.println(newIntValue);

    }
}
