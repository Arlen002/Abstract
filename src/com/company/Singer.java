package com.company;

public class Singer extends Person {
    String bandName;


    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    void singing(){
        System.out.println("Жандуу ун менен ырдоо");
    }
    void playGitar(){
        System.out.println("Гитара чертуу ");
    }
    @Override
    public String toString(){
        return name+" "+ designation+" "+bandName;
    }
}
