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
    int[] s3 = { 2 };
    // int[] s5 = Arrays.binarySearch(s4, s3);
    System.out.println(s);

    

}}