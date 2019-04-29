package com.kgisl.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ListtoStr
 */
public class ListtoStr {

    public static void main(String[] args) {
        
        String commaSeparated = "item1 , item2 , item3";

        List<String> al=Arrays.asList(commaSeparated);
        List<String> re=Arrays.asList(commaSeparated.split("\\s,\\s"));
        System.out.println(re);
    }
}