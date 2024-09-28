public class AssignmentOperators {
    public static void main(String[] args){
        int num = 50; //Assignment
        System.out.println("Original value: "+num);

        num-=10; //num = num - 10;
        System.out.println("New value after subtracting 10: "+num);

        num+=20; //num = num + 20;
        System.out.println("New value after adding 20: "+num);

        num/=5; //num = num/5;
        System.out.println("New value after dividing by 5: "+num);

        num*=2; //num = num * 2;
        System.out.println("New value after multiplying by 2: "+num);
    }
}
