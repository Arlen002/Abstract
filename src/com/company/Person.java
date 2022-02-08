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
        System.out.println(" Жаны иснтрументтерди ойногондуу уйронуудомун. ");
    }
    void walk(){
        System.out.println(" Kундо эрте менен чуркайм, денемди чын кармоо учун. ");
    }
    void eat(){
        System.out.println(" Код жазып жатканда созсуз кофе ичем. ");
    }
    @Override
    public String toString(){
        return name+ designation;
    }

}
