package com.kgisl.basics;

/**
 * DemoConstructor
 */
public class DemoConstructor {
    DemoConstructor(){
        System.out.println("Constructor");
    }
    static void Demo() {
        System.out.println("Static Constuctor");
    }
    
    void demo1() {
        System.out.println("Normal Method");
    }


    public static void main(String[] args) {
        
        DemoConstructor d = new DemoConstructor();
        d.demo1();
        Demo();
        
        
    }
}