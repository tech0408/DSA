package dsa.stream_apis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class Example2 {
    public static void main(String[] args) {

        /*
        Given a list of Employee objects, group them by their department
        and calculate the total salary for each department.
        Sort the departments by total salary in descending order.
         */

        List<Employee> eList = Arrays.asList(
                new Employee("Sawan","ISE",50000.0),
                new Employee("Rishika","ISE", 100000.0),
                new Employee("Suman","CSE", 10000.0),
                new Employee("Rishu","CSE", 90000.0),
                new Employee("Rishav","ECE", 4000.0)
        );

        eList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary
        ))).entrySet().stream().sorted(Map.Entry.<String,Double>comparingByValue().reversed()).forEach(System.out::println);


        String [] names = {"sawan", "ashu","tanuranjan","abi"};

        List<String> sortedList= Stream.of(names).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println(Stream.of(names).max(Comparator.comparing(String::length)).get());
    }
}
