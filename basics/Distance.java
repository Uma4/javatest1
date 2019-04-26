package com.kgisl.basics;

import java.util.Scanner;


/**
 * Distance
 */
public class Distance {
  static double convertIntoKms(double miles){
        double km=1.609*miles;
        return km;
    }
    
    
  static double convertIntoMiles(double km){
        double miles=km/1.609;
        return miles;
    }
    
    public static void main(String[] args) {
            Scanner sc  =   new Scanner(System.in);
            double miles   =   sc.nextDouble();
            System.out.println(miles+" "+convertIntoKms(miles));
        
            double kms   =   sc.nextDouble();
            System.out.println(kms+"  "+convertIntoMiles(kms));
            
            
        
        }
    }
