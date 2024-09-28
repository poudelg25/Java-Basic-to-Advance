public class LogicalOperators2 {
    public static void main(String[] args) {
        boolean isStudent = false;
        byte age = 10; // discount for age < 5 or > 80

        if (!isStudent || age < 5 || age > 80) {
            System.out.println("Discount applied!!");
        } else {
            System.out.println("Discount could not applied!!");
        }
    }
}
