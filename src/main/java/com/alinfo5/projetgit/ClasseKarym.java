package com.alinfo5.projetgit;

public class ClasseKarym {
    public static void parite(Double a) {
        if (a % 2 == 0) {
            System.out.println(a + " est un nombre pair");

        } else {
            System.out.println(a + " est un nombre impair");

        }
        

    }
    public static Double produit (Double a, Double b){
        return a*b;
    }

    public static int Calculsoustraction(int a, int b) {
        return a - b;
    }

    public static void factor(int number) {
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        parite(6.0);
        Calculsoustraction(5, 1);
    }

}
