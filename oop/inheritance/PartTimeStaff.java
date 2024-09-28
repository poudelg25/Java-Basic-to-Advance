package oop.inheritance;

public class PartTimeStaff extends Staff{
    // PartTimeStaff = Child Class
    //Employee = Parent Class

    private Double noOfHours;
    private Double ratePerHour;

    public Double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(Double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public Double getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(Double noOfHours) {
        this.noOfHours = noOfHours;
    }

    public void calculateEarning(){
        System.out.println("Total earning is: $"+(noOfHours*ratePerHour));
    }

    public PartTimeStaff(){
        //super(); //calling parent's constructor
        System.out.println("Inside Part Time Staff constructor.");
    }

    public static void main(String[] args){
        PartTimeStaff partTimeStaff = new PartTimeStaff();
        partTimeStaff.setName("Gita");
        partTimeStaff.setId(2);
        partTimeStaff.setAddress("Wisconsin");
        partTimeStaff.setAge(30);
        partTimeStaff.setPosition("Frontend Developer");
        partTimeStaff.setSalary(45000d);

        partTimeStaff.displayDetails();

        System.out.println();
        System.out.println("##########################");
        //or we can do toString to print details
        System.out.println(partTimeStaff.toString());

        System.out.println();
        System.out.println("##########################");
        partTimeStaff.setRatePerHour(38d); //partTimeStaff.ratePerHour=38d;
        partTimeStaff.setNoOfHours(45d);//partTimeStaff.noOfHours =45d;

        partTimeStaff.calculateEarning();
    }
}
