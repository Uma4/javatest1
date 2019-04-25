package com.kgisl.basics;

// import java.util.*;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Employees
 */
public class Sample {
    public static void main(String[] args) {

        List<Employee> ll = Arrays.asList(new Employee(101, "Anuj", "AO", 20000),
                new Employee(102, "Dhanuj", "BO", 15000), new Employee(102, "Anuj1", "AO", 19000),
                new Employee(103, "Dhanuj1", "BO", 10000), new Employee(103, "Anuj2", "AO", 16000),
                new Employee(104, "Dhanuj2", "BO", 5000), new Employee(104, "Anuj3", "AO", 15000),
                new Employee(105, "Dhanuj3", "BO", 10000));
        System.out.println("=================");
        System.out.println("\nTotal Salary of all the Employee");
        double d1 = ll.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(d1);
        System.out.println("\nTotal Salary of AO-Dept");
        Predicate<Employee> pred = x -> x.getDept() == "AO";
        List<Employee> l1 = ll.stream().filter(pred).collect(Collectors.toList());
        double d2 = l1.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(d2);
        System.out.println("\nTotal Salary of BO-Dept");
        Predicate<Employee> pred1 = x -> x.getDept() == "BO";
        List<Employee> l2 = ll.stream().filter(pred1).collect(Collectors.toList());
        double d3 = l2.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(d3);

        ll.stream().max(Comparator.comparing(y -> y.getSalary() + " \tDept:" + y.getDept()))
                .ifPresent(p -> System.out.println("Dept with highest pay:" + p));
        ll.stream().min(Comparator.comparing(y -> y.getSalary() + "\t Dept:" + y.getDept()))
                .ifPresent(p -> System.out.println("Dept with lowest pay:" + p));

        
        
            
        

    }
}