package com.alinfo5.projetgit;

public class ClassMohamed {

  public static Double produit (Double a, Double b){
    return a*b;
}
public static void max (int a ,int b) {
  if ( a > b) {
    System.out.println(a) ;
  } else {
 System.out.println(b) ;
  }


}

  public static void factor(int number) {
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; ++i) {
          if (number % i == 0) {
            System.out.print(i + " ");
          }
        }
    }
    
    public static void main(String args[])
    {
      max(3,5) ;
    
    }

}
