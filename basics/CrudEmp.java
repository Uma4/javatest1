package com.kgisl.basics;


import java.util.ArrayList;

/**
 * CrudEmp
 */
public class CrudEmp {
    ArrayList<Employee> al=new ArrayList<Employee>(); 
public static void main(String[] args) {
    
     
    Employee updateEmployee = new Employee(102, "updatename", "Dept2", 2000);
    CrudEmp ce = new CrudEmp();
   
    ce.getAllEmployee();
    ce.getEmployee(0);
    ce.newEmployee();
    ce.updateEmployee(102, updateEmployee);
    ce.removeEmployee(101);
}
CrudEmp(){
    getAllEmployee();
}

   

    private void removeEmployee(int empid) {
        for (Employee e : al) {
            if(e.getEmpid()==empid){
                System.out.println(al.indexOf(e));
                al.remove(al.indexOf(e));
            }
    }}

    private void updateEmployee(int empid, Employee updateEmployee) {
        for (Employee e : al) {
            if(e.getEmpid()==empid){
                System.out.println(al.indexOf(e));
                al.set(al.indexOf(e),updateEmployee);
            }
        }}

    private ArrayList<Employee> newEmployee() {
        al.addAll(newEmployee());
        return al;
        

    }

    private void getEmployee(int empid) {
        for (Employee e : al) {
            if(e.getEmpid()==empid){
                System.out.println(String.valueOf(e.getEmpid()+""+e.getName()+""+e.getDept()+""+e.getSalary()));
            }
           System.out.println(getAllEmployee()); 
        }
    }

    private  ArrayList<Employee> getAllEmployee() {
        System.out.println(al);
        return al;
        
    }

    
}
