public class UserDefinedMethod {
    public static void main(String[] args){

        int[] nums = {4, 7, 67, 56, 345, 78, 89};
        int[] nums2 = {56, 45, 34, 89, 332, 56, 786, 345};
        int[] nums3 ={88, 76, 50, 22, 37, 92, 77, 45, 986, 456};

        // Method invocation - calling the method here
        findMaximumNumber(nums);
        findMaximumNumber(nums2);
        findMaximumNumber(nums3);

    }
    //Method to find maximum value of an array
    public static void findMaximumNumber(int[] numbers){//Method signature
       //Method body/ implementation - actual logic to find maximum value of an array
        int max =numbers[0];
        for(var i=1; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The maximum number in the array is: "+max);
    }
}
