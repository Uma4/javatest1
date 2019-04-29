package com.kgisl.basics;
import java.util.Scanner;

/**
 * Name
 */
public class Name {
public static void main(String[] args) {
    
    
    System.out.println("type in first name and last name:");
    Scanner sc=new Scanner(System.in);
    String value=sc.nextLine();
    String value1=sc.nextLine();
    String val = value.concat(value1);
    
    System.out.println("first name:"+value.length());
    System.out.println("last name:"+value1.length());
    System.out.println(val);

    System.out.println("Enter the speed and distance to calculate:");
    int speed = sc.nextInt();
    int dist = sc.nextInt();
    System.out.println("At\t"+speed+"mph"+",it will take"+dist/speed+"hours to travel\t"+dist+"miles");
}
}