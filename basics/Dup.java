package com.kgisl.basics;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Dup
 */
public class Dup {

    public static void main(String[] args) {
        
            ArrayList<String> list = new ArrayList<String>();
            list.add("Anuj");
            list.add("Dhanuj");
            list.add("Raj");
            list.add("Dhanuj");
            
    
            System.out.println("Duplicates List: " + list);
            ArrayList<String> myArrayList = new ArrayList<String>(new HashSet<String>(list));
            System.out.println("Removed:"+myArrayList);
            
    }
}