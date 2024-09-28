import java.util.Arrays;

public class ArrayWithDoubleDataType {
    public static void main(String[] args){

        Double[] values ={3.2, 5.6, 7.0, 5.2, 9.6};

        System.out.println("Arrays original values are: ");
        for(Double value: values){
            System.out.println(value);
        }

        System.out.println();
        System.out.println("##############");
        System.out.println("Total length of arrays:"+values.length);

        Arrays.sort(values);

        System.out.println();
        System.out.println("################");
        System.out.println("Sorted values in arrays: ");
        for(double value: values){
            System.out.println(value);
        }
    }
}
