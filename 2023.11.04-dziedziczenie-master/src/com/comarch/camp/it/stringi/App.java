package com.comarch.camp.it.stringi;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Circle c1 = new Circle(7);
        Circle c2 = new Circle(5);

        System.out.println(c1.equals(c2));

        String s1 = "Janusz";
        String s2 = "Janusz";

        System.out.println(s1.equals(s2));

        Double d1 = 5.5;
        Double d2 = 5.5;

        System.out.println(d1.equals(d2));

    }
}
