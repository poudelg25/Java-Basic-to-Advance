public class ArrayExample4 {
    public static void main(String[] args){
        // Finding max value in the array
        int[] values ={7, 2, 5, 88, -88, 40, 334, 659, 30, 467, -9};

        int max =values[0];
        for(var i=1; i<values.length; i++){
            if(values[i]> max){
                max = values[i];
            }
        }
        System.out.println("The max value in the array is: "+max);
    }
}
