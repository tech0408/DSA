//package dsa;
//
//import java.util.*;
//import java.util.concurrent.ConcurrentMap;
//import java.util.stream.Collectors;
//
//class Student{
//
//    public String name;
//    public int age;
//    public String city;
//    public Double marks;
//    public String branch;
//
//    Student(String name, int age, String city, Double marks, String branch){
//        this.name=name;
//        this.age=age;
//        this.city =city;
//        this.marks =marks;
//        this.branch=branch;
//    }
//
//    public String getName(){
//        return name;
//    }
//}
//
//public class StreamExample {
//
//    public static void main(String[] args) {
//
//        Student [] sL = {
//          new Student("Sawan",28,"Patna",250.0,"ISE"),
//                new Student("Rishika",24,"Delhi",280.0,"ISE"),
//                new Student("Riya",30,"Patna",295.0,"CSE"),
//                new Student("Farheen",23,"Dhaka",220.0,"ECE"),
//                new Student("Anjali",28,"Patna",220.0,"ECE")
//        };
//
//        Arrays.stream(sL).forEach(System.out::println);
//
//        // Group by city.
//        Map<String,Long> branchCountMap = Arrays.stream(sL).collect(
//                Collectors.groupingBy(s->s.city,Collectors.counting()));
//        System.out.println(branchCountMap);
//
//        Set<String> cityL = Arrays.stream(sL).map(s->s.city).collect(Collectors.toSet());
//        System.out.println(cityL);
//
//        List<Student> studentSortedList = Arrays.stream(sL).sorted(Comparator.comparingInt(s->s.age)).toList();
//        //System.out.println(studentSortedList);
//
//        Map<String,List<Student>> bSL = Arrays.stream(sL).collect(Collectors.groupingBy(s->s.branch,
//                        Collectors.collectingAndThen(Collectors.toList(),
//                                list-> list.stream().sorted(Comparator.comparingDouble(s->s.marks).reversed())
//                                        .collect(Collectors.toList()))));
//        System.out.println(bSL);
//
////        List<String> cityList = Arrays.stream(sL).map(s-> s.city).distinct().collect(Collectors.toList());
////        System.out.println(cityList);
//    }
//}
