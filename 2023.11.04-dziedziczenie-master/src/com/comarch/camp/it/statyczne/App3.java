package com.comarch.camp.it.statyczne;

public class App3 {
    public static void main(String[] args) {
        Client c1 = new Client();
        c1.name = "Janusz";
        c1.surname = "Kowalski";

        Client c2 = new Client();
        c2.name = "Zbyszek";
        c2.surname = "Malinowski";

        System.out.println(c1.name);
        System.out.println(c1.surname);

        System.out.println(c2.name);
        System.out.println(c2.surname);

        Client.name = "Cezary";

        System.out.println(c1.name);
        System.out.println(c1.surname);

        System.out.println(c2.name);
        System.out.println(c2.surname);
    }
}
