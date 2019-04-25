package com.kgisl.basics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ListtoStr
 */
public class ListtoStr {

    public static void main(String[] args) {
        
        String commaSeparated = "item1 , item2 , item3";
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(commaSeparated.split(",")));
        System.out.println(al);
    }
}