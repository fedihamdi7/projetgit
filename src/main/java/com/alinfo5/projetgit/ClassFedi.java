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
    public static void main(String[] args) {
        ClassFedi.factor(12);
    }
}
