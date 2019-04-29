package com.kgisl.basics;

import java.util.Comparator;



/**
 * SalaryComparator
 */
public class SalaryComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 e, Employee1 e1) {
        if(e.salary==e1.salary)
        return 0;
        else if(e.salary>e1.salary)
        return 1;
        else
        return -1;
    }

    
}