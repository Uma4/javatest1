package com.kgisl.basics;

import java.util.Random;
import java.util.Scanner;

/**
 * Game
 */
public class Game {
public static void main(String[] args) {
    

    Random rd = new Random();
    int numtoGuess = rd.nextInt(100);
    int numtoGuess1 = rd.nextInt(100);
    int numtoGuess2 = rd.nextInt(100);
    
    System.out.println("Please, type in an integer in the range 1 ... 2147483646 :");
    Scanner sc = new Scanner(System.in);
    int guess = sc.nextInt();
    
    System.out.println("You typed in:"+guess);
    System.out.println("My numbers are:"+numtoGuess+","+numtoGuess1+"and\t"+numtoGuess2);
}
}