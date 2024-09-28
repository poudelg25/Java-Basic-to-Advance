public class LogicalOperators {
    public static void main(String[] args) {
        boolean isRaining = true;
        System.out.println("Is raining now? = "+isRaining);
        System.out.println("Is raining now? = "+!isRaining);

        boolean parentsAllowed = true, hasMoney = true;
        boolean goingToTrip=false;

        if(parentsAllowed && hasMoney){
            goingToTrip = true;
        }
        System.out.println("I am going to trip? = "+goingToTrip);

    }
}
