package com.comarch.camp.it.dziedziczenie;

public class Sznaucer extends Dog {
    public double broda;

    public Sznaucer(String name, String race, int age, int paw, double broda) {
        super(name, race, age, paw);
        this.broda = broda;
    }

    public Sznaucer() {
    }

    @Override
    void bark() {
        super.bark();
        System.out.println("Dodatkowe Hau !!!");
    }
}
