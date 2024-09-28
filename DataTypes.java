public class DataTypes {
    public static void main(String[] args){
        //data-type variable-name
        byte age = 127;
        short noOfStudents = 32767;
        int studentId = 2147483647;
        long phoneNumber = 9999999999L;
        System.out.println(age);
        System.out.println(noOfStudents);
        System.out.println(studentId);
        System.out.println(phoneNumber);

        //Decimal Numbers
        //+-3.40282347 * 10^38
        float price = 3000.5f;
        double salary = 489485.4;
        System.out.println(salary);
        System.out.println(price);

        //Character
        char gender = 'm';
        char choice ='N';
        System.out.println(gender);
        System.out.println(choice);


        //Boolean
        boolean isPassed = true;
        boolean isRaining = false;
        System.out.println(isPassed);
        System.out.println(isRaining);
    }
}
