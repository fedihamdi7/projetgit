package com.alinfo5.projetgit;

public class ClassFedi {
    public static void factor(int number) {
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; ++i) {
          if (number % i == 0) {
            System.out.print(i + " ");
          }
        }
    }

    public static void parite(Double a) {
      if (a % 2 == 0) {
          System.out.println(a + " est un nombre pair");

      } else {
          System.out.println(a + " est un nombre impair");
        // commentaire
      }

  }
    public static void main(String[] args) {
        ClassFedi.factor(12);
    }
}
