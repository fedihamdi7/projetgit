package com.alinfo5.projetgit;

public class ClasseKarym {
    public static void parite(Double a) {
        if (a % 2 == 0) {
            System.out.println(a + " est un nombre pair");

        } else {
            System.out.println(a + " est un nombre impair");

        }

    }

    public static void main(String[] args) {
        parite(6.0);
    }

}
