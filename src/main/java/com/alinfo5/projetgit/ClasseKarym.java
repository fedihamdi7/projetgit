package com.alinfo5.projetgit;

public class ClasseKarym {

    public static Double produit(Double a, Double b) {
        return a * b;
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


    }

}
