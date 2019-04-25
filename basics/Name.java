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
     int a=value.indexOf(' ');
    String fn=value.substring(0, a);
    String ln=value.substring(a+1);
    System.out.println("first name:"+fn.length());
    System.out.println("last name:"+ln.length());
}
}