package com.company;

public class Main {

    public static void main(String[] args) {

	Programmer pr = new Programmer(" Arlen ","Backand Developer "," Peaksoft ");
        System.out.println(pr);
        pr.coding();

	Dancer dancer = new Dancer(" Atai "," Бийчи "," Ak-Kalpak ");
        System.out.println(dancer);
        dancer.dancing();

	Singer singer = new Singer(" Улан Осмон Улуу "," Гитарист "," Шумкар ");
		System.out.println(singer);
		singer.playGitar();
		singer.singing();



    }
}

