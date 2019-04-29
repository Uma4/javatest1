package com.kgisl.basics;

/**
 * DumConst
 */
public class DumConstructor {

    int id,no;
    String name;

    public DumConstructor() {
        this(5);
        System.out.println("Welcome1");
    }
    DumConstructor(int id) {
        
        this(5,"ANuj");
        System.out.println("Welcome2");
    }

    DumConstructor(int id, String name) {
       
        this(5,"Anuj",100);
        System.out.println("Welcome3");
        
    }
    DumConstructor(int id, String name,int no) {
        System.out.println("Welcome4");
        
    }
    

    public static void main(String[] args) {

       new DumConstructor();
        
        
    }
}