package com.comarch.camp.it.stale;

public class App {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);

        a = 7;
        System.out.println(a);

        final double PI = 3.14;
        System.out.println(PI);

        final int JAKAS_WAZNA_STALA = 4;

        final Circle c = new Circle(7);
        System.out.println(c.getRadius());
        c.setRadius(10);
        System.out.println(c.getRadius());
    }
}
