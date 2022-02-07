package com.company;

public class Person {
    String name;
    String designation;

    public Person(){
    }
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    void learn(){
        System.out.println(" IT - Уйронуудомун ");
    }
    void walk(){
        System.out.println("Кундо эрте менен чуркоо ");
    }
    void eat(){
        System.out.println("Туура тамактануу ");
    }
    @Override
    public String toString(){
        return name+ designation;
    }

}
