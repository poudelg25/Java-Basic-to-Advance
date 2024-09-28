public class ContinueUsesInLoop {
    public static void main(String[] args){

        int[] numbers={45, 60, 33, 27, 45, 8, 4, 39, 13, 16, 4};

        for(int num: numbers){
            if(num%2 != 0){
                continue;
            }
            System.out.println(num);
        }
    }
}
