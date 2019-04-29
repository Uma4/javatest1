package com.kgisl.basics;

import java.util.Scanner;


/**
 * Distance
 */
public class Distance {
      public static void main(String[] args) {
            System.out.println("Enter the value to convert:");
            Scanner sc  =   new Scanner(System.in);
            double var_x   =   sc.nextDouble();
            System.out.println("Enter ur choice:");
            char c = new Scanner(System.in).next().charAt(0);
            switch (c) {
              case 'm':
              System.out.println("m to km= " + var_x * 1.60934);
              break;
              case 'k':
              System.out.println("km to m= " + var_x * 0.621371);
              break;
              default:
                break;
            }
            
        
        }
    }
