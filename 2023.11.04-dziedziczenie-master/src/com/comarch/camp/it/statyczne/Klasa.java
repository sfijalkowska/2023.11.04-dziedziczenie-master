package com.comarch.camp.it.statyczne;

public class Klasa {

    static {
        System.out.println("Statyczny blok kodu !!");
    }
    static Klasa2 klasa2 = new Klasa2();
}
