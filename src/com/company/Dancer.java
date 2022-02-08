package com.company;

public class Dancer extends Person{
    String groupName;


    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
        this.walk();
    }
    void dancing(){
        System.out.println(" Кара-жорго бийлоо. ");
    }
    @Override
    public String toString(){
        return "Аты: "+name+",кесиби "+ designation+", группасы "+groupName;
    }
}
