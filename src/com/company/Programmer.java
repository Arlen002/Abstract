package com.company;

 public class Programmer  extends Person {
     String companyName;

     public Programmer(String name, String designation, String companyName) {
         super(name, designation);
         this.companyName = companyName;
         super.learn();
         super.walk();
         super.eat();
     }
     void coding(){
         System.out.println("Код жаза алуу");
     }
     @Override
     public String toString(){
         return name+" "+ designation+" "+companyName;
     }

 }
