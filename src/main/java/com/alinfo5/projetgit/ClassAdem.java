package com.alinfo5.projetgit;

public class ClassAdem {
    public static int Calculsoustraction(int a, int b) {
        return a - b;
    }

    public static Double CalculAvg(Double a, Double b) {
        return (a + b) / 2;
    }

    public static void parite(Double a) {
        if (a % 2 == 0) {
            System.out.println(a + " est un nombre pair");

        } else {
            System.out.println(a + " est un nombre impair");

        }

    }

    public static void main(String[] args) {

        System.out.println(CalculAvg(8.5, 9.5));

        System.out.println(Calculsoustraction(6, 5));

        parite(6.0);

    }
}
