package com.comarch.camp.it.dziedziczenie;

public class Dog extends Pet {
    int paw;

    public Dog(String name, String race, int age, int paw) {
        super(name, race, age);
        this.paw = paw;
    }

    public Dog() {
    }

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }

    void bark() {
        System.out.println("Hau hau !!");
    }
}
