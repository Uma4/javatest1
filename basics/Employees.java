package com.kgisl.basics;

import java.util.ArrayList;
import java.util.List;




public class Employees  {
    
    ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
    

    public static void main(String[] args) {
        Employee newEmployee = new Employee(11, "name", "Dept", 5020);
        Employee updateEmployee = new Employee(23, "updatename", "Dept1", 5020);
        Employees ee = new Employees();
        ee.loadEmployees();
        ee.getAllEmployees();
        ee.getEmployee(12);
        ee.newEmployee(newEmployee);
        ee.updateEmployee(502,updateEmployee);
        ee.removeEmployee(101);
    }

    public Employees() {
        loadEmployees();   
    }

    public void loadEmployees() {
        EmployeeList.add(new Employee(10, "ramu", "Dept1", 101));
        EmployeeList.add(new Employee(20, "Divya", "Dept3", 12));
        EmployeeList.add(new Employee(30, "Janani", "Dept4", 11));
    }

    public List<Employee> getAllEmployees() {
        // System.out.println(EmployeeList);
        return EmployeeList;
    }

    public Employee getEmployee(int empid) {
        for (Employee Employee : EmployeeList) {
            if (Employee.getEmpid() == empid) {
                // System.out.println(String.valueOf(Employee.getempid())+Employee.getName());
                return Employee;
            }
        }

        return getEmployee(0);

    }

    public void newEmployee(Employee Employee) {
        EmployeeList.add(Employee);
        getAllEmployees();
        // System.out.println(EmployeeList);
    }

    public void updateEmployee(int empid, Employee updateEmployee) {
        for (Employee Employee : EmployeeList) {
            if (Employee.getEmpid() == empid) {
                // System.out.println(EmployeeList.indexOf(Employee));
                EmployeeList.set(EmployeeList.indexOf(Employee), updateEmployee);
            }
        }
        getAllEmployees();
        // System.out.println(EmployeeList);
    }

    public void removeEmployee(int empid) {
        for (Employee Employee : EmployeeList) {
            if (Employee.getEmpid() == empid) {
                // System.out.println(EmployeeList.indexOf(Employee));
                EmployeeList.remove(EmployeeList.indexOf(Employee));
            }
            // break;
        }
        getAllEmployees();
        // System.out.println(EmployeeList);
    }
}