public class ForLoop {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        System.out.println("#####################");
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello World!");
        }

        System.out.println("#####################");
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello World"+i);
        }

        System.out.println("#####################");
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        System.out.println("#####################");
       /* for(; ;){ //Infinite for loop
            System.out.println("Hello World!");
        }*/


        //To print even number
        for(int i = 0; i <= 5; i+=2){
            System.out.println(i);
        }

        System.out.println("#####################");
        //To print odd number
        for(int i = 1; i <= 5; i+=2){
            System.out.println(i);
        }

        //To print odd number in decrement order
        System.out.println("#####################");
        for(int i = 10; i >= 1; i-=2){
            System.out.println(i);
        }


        System.out.println("#####################");
        // Using i++ (postfix increment)
        for(int i = 1; i <= 5; ) {
            System.out.print(i++ + " "); // Output: 1 2 3 4 5
        }
        System.out.println();
        System.out.println("#####################");

        // Using ++i (prefix increment)
        for(int i = 1; i <= 5; ) {
            System.out.print(++i + " "); // Output: 2 3 4 5 6
        }

        System.out.println();
        System.out.println("#####################");

        //Sum of first five natural numbers (1+2+3+4+5)
        int sum =0;
        for(int i = 1; i<=5; i++){
             sum +=i;
        }
        System.out.println("Sum of first 5 natural numbers is: "+sum);
    }
}
