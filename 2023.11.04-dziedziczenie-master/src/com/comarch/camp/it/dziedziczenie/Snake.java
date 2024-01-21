package com.comarch.camp.it.dziedziczenie;

public class Snake extends Pet {

    public Snake(String name, String race, int age) {
        super(name, race, age);
    }

    public Snake() {
    }

    @Override
    void walk() {
        System.out.println("pelzam !!!");
    }
}
