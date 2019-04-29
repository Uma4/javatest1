package com.kgisl.basics;

import java.util.Arrays;
// import java.util.List;

/**
 * ArrMethod
 */
public class ArrMethod {
public static void main(String[] args) {
    

    int[] s = {1,2,3};
    String s1 = Arrays.toString(s);
    System.out.println(s1);
    int[] s2 = Arrays.copyOf(s, 4);
    System.out.println(Arrays.toString(s2));
 
    System.out.println("Binary Search");
    int[] s4 = { 1, 2, 3 };
    Arrays.sort(s4);
    int k = 2;
    System.out.println((Arrays.binarySearch(s4, k)));

    Emp1 emp1[] = new Emp1[3];
    // Emp1 emp[] = { new Emp1(1, "name1"), new Emp1(2, "name2") };    
        Arrays.fill(emp1, new Emp1(7, "name1"));
        System.out.println(Arrays.toString(emp1)); 
   
}}