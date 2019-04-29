package com.kgisl.basics;

import java.util.Comparator;


/**
 * IdComparator
 */
public class IdComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 e, Employee1 e1) {
    if(e.empid==e1.empid)
        return 0;
    else if(e.empid>e1.empid)
        return 1;
    else
    return -1;
    }   
}