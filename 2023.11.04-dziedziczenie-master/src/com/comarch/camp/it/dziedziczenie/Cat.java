package com.comarch.camp.it.dziedziczenie;

public class Cat extends Pet {

    public Cat(String name, String race, int age) {
        super(name, race, age);
    }

    public Cat() {
    }

    void mew() {
        System.out.println("Miau miau !!");
    }
}
