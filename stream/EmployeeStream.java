package stream;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Gopal", "Male","Engineering", 5000d, 4));
        employeeList.add(new Employee("Sita", "Female","HR", 7000d, 9));
        employeeList.add(new Employee("Hari", "Male","Account", 6000d, 2));
        employeeList.add(new Employee("Gita", "Female","HR", 6500d, 20));
        employeeList.add(new Employee("Ram", "Male","Engineering", 8000d, 17));
        employeeList.add(new Employee("John", "Male","Marketing", 4500d, 7));
        employeeList.add(new Employee("Caroline", "Female","Engineering", 7500d, 3));
        employeeList.add(new Employee("Nancy", "Female","Account", 5500d, 11));
        employeeList.add(new Employee("Kamala", "Female","Engineering", 8500d, 8));



        // Filtering out Employees who work in HR department
        System.out.println("#################");
        System.out.println("Printing Employees from HR department: ");
        employeeList.stream()
                .filter(employee -> employee.getDepartment()
                        .equals("HR"))
                        .forEach(System.out::println);


        // Filtering out Employees who get salary more than 7000
        System.out.println("##############");
        System.out.println("Printing Employees who get salary more than $7000");
        employeeList.stream().filter(employee -> employee.getSalary()>7000).forEach(System.out::println);


        // Filtering out Employees who get maximum salary
        System.out.println("##############");
        System.out.println("Printing the employee who gets maximum salary from employee list: ");
        Employee maxSalaryEmployee = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(maxSalaryEmployee);


        // Filtering out Employees who get minimum salary
        System.out.println("##############");
        System.out.println("Printing the employee who gets minimum salary: ");
        System.out.println(employeeList.stream().min(Comparator.comparing(Employee::getSalary)).get());


        //Sorting Employee based on years worked (natural order/ascending order)
        System.out.println("##############");
        System.out.println("Printing the employee in sorted order(natural/ascending) based on years worked: ");
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getYearsWorked))
                .forEach(System.out::println);


        //Sorting Employee based on years worked (reverse order/descending order)
        System.out.println("##############");
        System.out.println("Printing the employee in sorted order(descending/reverse) based on years worked: ");
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getYearsWorked, Comparator.reverseOrder()))
                .forEach(System.out::println);


        // Printing All Female Employees only from the employee list
        System.out.println("##############");
        System.out.println("Printing All Female Employees from the employee list: ");
        employeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Female"))
                .forEach(System.out::println);


        // Calculating bonus amount for employees
        System.out.println("##############");
        System.out.println("Calculating bonus for each employee from the employee list: ");
        employeeList.stream().map(employee -> employee.getSalary()*0.1).forEach(System.out::println);

        // Calculating bonus amount and adding that bonus to each employee salary on employee list
        System.out.println("##############");
        System.out.println("Calculating new salary by adding bonus for each employee from the employee list: ");
        employeeList.stream().map(employee -> {employee.setSalary(employee.getSalary()*1.1);
            return employee;
        }).forEach(System.out::println);
        // note: this will also change the salaries of original employee list because forEach
        // terminal operation is executed here

        // Grouping by gender
        System.out.println("##############");
        System.out.println("Grouping employees by gender");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender))
                .forEach((gender, employee)-> {
                    System.out.println(gender);
                    employee.forEach(System.out::println);
                    System.out.println();
                });



        // Grouping by department
        System.out.println("##############");
        System.out.println("Grouping employees by department");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((department, employee)->{
                    System.out.println(department);
                    employee.stream().forEach(System.out::println);
                    System.out.println();
                });


        // Employee having Maximum Salary by HR department
        System.out.println("##############");
        System.out.println("Finding employee having maximum salary by HR department");
        System.out.println(employeeList.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("HR"))
                .max(Comparator.comparing(Employee::getSalary)).get());

        // Grouping by department and counting total employees in each department
        System.out.println("##############");
        System.out.println("Grouping by department and counting total employees in each department");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((department, employee)->{
                    System.out.println(department+": "+employee.size());
                    System.out.println();
                });

        // Grouping by department and finding employee having maximum salary in each department
        System.out.println("##############");
        System.out.println("Grouping by department and finding employee having maximum salary in each department");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((department, employee)-> {
                    System.out.println(department+": "+employee.stream().max(Comparator.comparing(Employee::getSalary)).get());
                });


        // Grouping by department and finding maximum salary in each department
        System.out.println("##############");
        System.out.println("Grouping by department and finding maximum salary in each department");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((department, employee)->{
                    System.out.println(department+": "+employee.stream().max(Comparator.comparing(Employee::getSalary))
                            .get().getSalary());
                });
    }
}
