package com.kgisl.basics;

/**
 * Employee
 */
public class Employee {

int empid;
String name;
String dept;
float salary;


public Employee(int empid, String name, String dept, int salary) {
    this.empid = empid;
    this.name = name;
    this.dept = dept;
    this.salary = salary;
}



/**
 * @return the empid
 */
public int getEmpid() {
    return empid;
}
/**
 * @return the name
 */
public String getName() {
    return name;
}
/**
 * @return the dept
 */
public String getDept() {
    return dept;
}
/**
 * @return the salary
 */
public float getSalary() {
    return salary;
}
/**
 * @param empid the empid to set
 */
public void setEmpid(int empid) {
    this.empid = empid;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
    this.name = name;
}
/**
 * @param dept the dept to set
 */
public void setDept(String dept) {
    this.dept = dept;
}
/**
 * @param salary the salary to set
 */
public void setSalary(float salary) {
    this.salary = salary;
}
@Override
public String toString() {
    return "Id:"+empid+"Name:"+name+"Department:"+dept+"Salary:"+salary;
}


}
