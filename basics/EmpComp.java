package com.kgisl.basics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * EmpComp
 */
public class EmpComp {
public static void main(String[] args) {
    

    ArrayList<Employee1> al = new ArrayList<Employee1>();
    al.add(new Employee1(11,"Danuj",9000)); 
    al.add(new Employee1(9,"Pranuj",19000));
    al.add(new Employee1(33,"Shanuj",5000));
    System.out.println("=================");
    System.out.println("ID Comparator");
    Collections.sort(al,new IdComparator());

    for(Employee1 em:al){
    System.out.println(em.empid+ " "+em.name+" "+em.salary);
    }System.out.println("=================");
    System.out.println("Name Compararor");
    Collections.sort(al,new NameComparator());

    for(Employee1 em:al){
        System.out.println(em.name+ " "+em.empid+" "+em.salary);
    }System.out.println("=================");
    System.out.println("Salary Compararor");
    Collections.sort(al,new SalaryComparator());

    for(Employee1 em:al){
        System.out.println(em.salary+ " "+em.empid+" "+em.name);
    }
}}