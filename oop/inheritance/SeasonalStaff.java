package oop.inheritance;

public class SeasonalStaff extends PartTimeStaff{

    String season;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void test(){
        System.out.println("This is just a test class inside Seasonal Staff.");

    }

    public static void main(String[] args){
        SeasonalStaff seasonalStaff = new SeasonalStaff();

        seasonalStaff.test();
        seasonalStaff.getNoOfHours();
        seasonalStaff.displayDetails();
    }
}
