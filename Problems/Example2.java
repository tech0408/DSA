package dsa.Problems;

import java.util.*;
import java.util.stream.Collectors;

class Employee{

    String name;
    int age;
    Double salary;
    String city;

    public Employee(String name, int age, double salary, String city) {

        this.name=name;
        this.age=age;
        this.salary=salary;
        this.city=city;
    }

    public Double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }
}

public class Example2 {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(

                new Employee("Sawan",28,30000.0,"patna"),
                new Employee("Ram",28,40000.0,"lucknow"),
                new Employee("Shyam",25,25000.0,"patna"),
                new Employee("Sita",38,70000.0,"delhi"),
                new Employee("Sourav",28,100000.0,"lucknow"),
                new Employee("Sikha",28,15000.0,"delhi")
        );

        Map<String,Optional<String>> mp = empList.stream().collect(Collectors.groupingBy(Employee::getCity,
                Collectors.collectingAndThen(Collectors.toList(), employees -> employees.stream().sorted(Comparator.comparing(
                        Employee::getSalary).reversed()).skip(1).findFirst().map(Employee::getName))));

        mp.forEach((key, value) -> System.out.println(key + ":" + value.get()));
    }
}
