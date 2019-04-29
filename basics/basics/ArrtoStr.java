package com.kgisl.basics;

import java.util.Arrays;
import java.util.List;

/**
 * ArrayToStng
 */
public class ArrtoStr {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Anuj","Shanuj","Dhanuj","Pranuj");
        String[] array = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

    }

}