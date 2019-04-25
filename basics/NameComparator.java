package com.kgisl.basics;

import java.util.Comparator;

/**
 * NameComparator
 */
public class NameComparator implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 e, Employee1 e1) {
        return e.name.compareTo(e1.name);
    }

    
}