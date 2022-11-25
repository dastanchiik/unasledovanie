package main;

import person.Dancer;
import person.Programmer;
import person.Singer;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setName("Ariet");
        programmer.setAge(17);
        programmer.setNational("Kyrgyz");
        programmer.setLanguageProgramming("Java");
        System.out.println(programmer);
        programmer.properties();
        System.out.print(" and ");
        programmer.programmer();
        Dancer dancer = new Dancer();
        dancer.setName("Janara");
        dancer.setAge(19);
        dancer.setNational("Kyrgyz");
        dancer.setDance("Kara-Jorgo");
        System.out.println(dancer);
        dancer.properties();
        System.out.print(" and ");
        dancer.properties1();
        Singer singer = new Singer();
        singer.setName("Daniel");
        singer.setAge(15);
        singer.setNational("Kyrgyz");
        singer.setGenre("Pop");
        System.out.println(singer);
        singer.properties();
        System.out.print(" and ");
        singer.properties2();
    }
}