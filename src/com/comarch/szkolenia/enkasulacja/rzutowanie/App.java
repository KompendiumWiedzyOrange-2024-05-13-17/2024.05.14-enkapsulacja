package com.comarch.szkolenia.enkasulacja.rzutowanie;

public class App {
    public static void main(String[] args) {
        int i = 7;
        double d = i;

        System.out.println(d);
        System.out.println(i);

        double d2 = 7.5;
        int i2 = (int) d2;

        int a = 5;
        int b = 2;
        double wynik = ((double) a) / ((double) b);
        System.out.println(wynik);

        String s = "5";
        int x = Integer.parseInt(s);

        System.out.println(x);

        boolean bool = true;
        String s2 = bool + "";
    }
}
