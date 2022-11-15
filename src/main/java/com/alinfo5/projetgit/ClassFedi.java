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

  public static int adition(int a, int b) {
    System.out.println(" addition");
    return a + b;
  }

  public static Double CalculAvg(Double a, Double b) {
    return (a + b) / 2;
  }

  public static Double produit(Double a, Double b) {
    return a * b;
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
    System.out.println(CalculAvg(8.5, 9.5));
  }
}
