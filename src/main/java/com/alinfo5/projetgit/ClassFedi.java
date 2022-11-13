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
    public static Double CalculAvg (Double a,Double b){
      return (a+b)/2;
}

    public static void main(String[] args) {
        ClassFedi.factor(12);
        System.out.println(CalculAvg(8.5,9.5));
    }
}
