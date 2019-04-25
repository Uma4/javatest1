package com.kgisl.basics;

/**
 * DumConst
 */
public class DumConstructor {

    int id,no;
    String name;

    public DumConstructor() {
        
    }
    DumConstructor(int id) {
        this.id = id;
        
    }

    DumConstructor(int id, String name) {
        this.id = id;
        this.name = name;
        
    }
    DumConstructor(int id, String name,int no) {
        this.id = id;
        this.name = name;
        this.no = no;
        
    }
    void demo(){
        System.out.println("Hai");
        System.out.println(id);
        System.out.println(id +" \t" +name );
        System.out.println(id +"\t" +name +"\t"+ no);
    }

    public static void main(String[] args) {

        DumConstructor dd = new DumConstructor(1,"aaaa",23);
        dd.demo();
        
    }
}