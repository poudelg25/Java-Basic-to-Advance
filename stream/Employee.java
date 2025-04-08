package stream;

public class Employee {
    private String name;
    private String gender;
    private String department;
    private Double salary;
    private Integer yearsWorked;

    public Employee(){

    }

    public Employee(String name, String gender, String department, Double salary, Integer yearsWorked) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getYearsWorked() {
        return yearsWorked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setYearsWorked(Integer yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", yearsWorked=" + yearsWorked +
                '}';
    }
}
