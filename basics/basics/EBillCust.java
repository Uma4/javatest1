package com.kgisl.basics;

import java.util.Scanner;



/**
 * EBillCust
 */
public class EBillCust {

    public static void main(String[] args) {
        System.out.println("Enter id:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println("Enter name:");
        // Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter the unit consumed:");
        int unit = sc.nextInt();
        double amt;
        double tot;
        // double sur = (15/100);
        if(unit>=199)
            amt = unit*1.20;
        else if(unit<=200 && unit>=399)
            amt = unit*1.50;
        else if(unit<=400 && unit>=599)
            amt = unit*1.80;
        else
            amt = unit*2;
        
        System.out.println("===========");
        if(amt>=400){
            tot = (amt*(15/100));
        }else{
            tot = amt;
        }

        System.out.println("The bill acquires is..."+tot);

        
    }
}