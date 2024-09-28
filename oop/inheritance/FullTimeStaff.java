package oop.inheritance;

public class FullTimeStaff extends  Staff{

    int paidTimeOf;
    double bonus;

    public int getPaidTimeOf() {
        return paidTimeOf;
    }

    public void setPaidTimeOf(int paidTimeOf) {
        this.paidTimeOf = paidTimeOf;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void calculateBonus(float percentage){
        bonus = getSalary()*percentage/100; // Bonus = 10% of salary
    }
    public static void main(String[] args){

        FullTimeStaff fullTimeStaff = new FullTimeStaff();
        fullTimeStaff.setName("Rajesh");
        fullTimeStaff.setSalary(10000d);

        fullTimeStaff.displayDetails();
        fullTimeStaff.calculateBonus(10);;

        System.out.println("your bonus is: $"+fullTimeStaff.getBonus());

    }
}
