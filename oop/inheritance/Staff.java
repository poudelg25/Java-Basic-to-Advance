package oop.inheritance;

public class Staff {
    // Data/Fields/Attributes
    private String name;
    private String position;
    private Integer id;
    private String address;
    private Double salary;
    private Integer age;

    public Staff(Integer id, String name, Integer age, String position, String address, Double salary ){
        this.id=id;
        this.name=name;
        this.age=age;
        this.position=position;
        this.address=address;
        this.salary=salary;
    }

    public void displayDetails(){
        System.out.println("Staff id is: "+id);
        System.out.println("Staff name is: "+name);
        System.out.println("Staff age is: "+age);
        System.out.println("Staff position is: "+position);
        System.out.println("Staff address is: "+address);
        System.out.println("Staff salary is: $"+salary+" per year.");
    }

    public Integer getId(Integer id){
        return id;
    }

    public String getName(String userName){
        if(userName.equals("test")){
            return " ";
        }
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public String getPosition(){
        return position;
    }

    public String getAddress(){
        return address;
    }

    public Double getSalary(){
        return salary;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void setPosition(String position){
        this.position=position;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public void setSalary(Double salary){
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
    public Staff(){
        System.out.println("Inside Staff constructor.");

    }

    public static void main(String[] args){

    }
}
