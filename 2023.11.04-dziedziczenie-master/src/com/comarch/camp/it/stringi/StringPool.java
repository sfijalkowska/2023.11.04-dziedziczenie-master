package com.comarch.camp.it.stringi;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1);
        System.out.println(s2);

        s1 = s1 + "DEF";

        System.out.println(s1);
        System.out.println(s2);
    }
}
