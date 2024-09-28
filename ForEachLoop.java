public class ForEachLoop {
    public static void main(String[] args){

        int[] numbers ={2, 5, 6, 7};

        for(int num: numbers){
            System.out.println(num);
        }

        String[] progLanguages = {"Java", "Python", "R", "C"};
        for(String prog: progLanguages){
            System.out.println(prog);
        }
    }
}
