package com.kgisl.basics;

/**
 * EBill
 */
public class EBill {

    int id;
    String name;
    int unit;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the unit
     */
    public int getUnit() {
        return unit;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param unit the unit to set
     */
    public void setUnit(int unit) {
        this.unit = unit;
    }
    @Override
    public String toString() {
        return "Id:"+id+"\tName:"+name+"\tUnit:";
    }
}