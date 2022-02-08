package com.company;

public class Singer extends Person {
    String bandName;
    
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
        this.learn();
    }
    void singing(){
        System.out.print(" Жандуу ун менен ырдайм.");
    }
    void playGitar(){
        System.out.print(" Гитара чертем.");
    }
    @Override
    public String toString(){
        return "Аты: "+name+", кесиби "+ designation+", группасы "+bandName;
    }
}
