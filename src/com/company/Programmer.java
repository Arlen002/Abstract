package com.company;

 public class Programmer  extends Person {
     String companyName;

     public Programmer(String name, String designation, String companyName) {
         super(name, designation);
         this.companyName = companyName;
         super.eat();
     }
     void coding(){
         System.out.println("Код жазган бул - менин суйуктуу ишим.");
     }
     @Override
     public String toString(){
         return "Аты: "+name+", жумушу "+ designation+", иштеген компания "+companyName;
     }

 }
