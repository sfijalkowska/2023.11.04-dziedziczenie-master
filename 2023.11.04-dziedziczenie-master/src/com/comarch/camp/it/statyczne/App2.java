package com.comarch.camp.it.statyczne;

public class App2 {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 4; i++) {
            /// ?????
            Thread.sleep(1000);
        }

        System.out.println(Klasa.klasa2);
    }
}
