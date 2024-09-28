public class UserDefinedMethod2 {
    public static void main(String[] args){
        int[] nums = {4, 7, 67, 56, 345, 78, 89};
        int[] nums2 = {56, 45, 34, 89, 332, 56, 786, 345};
        int[] nums3 ={88, 76, 50, 22, 37, 92, 77, 45, 986, 456};


        int maxValue = findMaxNumber(nums);
        System.out.println("Maximum value of the first array is: "+maxValue);

        maxValue = findMaxNumber(nums2);
        System.out.println("Maximum value of the second array is: "+maxValue);

        maxValue = findMaxNumber(nums3);
        System.out.println("Maximum value of the third array is: "+maxValue);
    }

    public static int findMaxNumber(int[] numbers){
        int max = numbers[0];
        for(var i=1; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }
}
