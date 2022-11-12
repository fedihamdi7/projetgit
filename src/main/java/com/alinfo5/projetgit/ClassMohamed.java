package com.alinfo5.projetgit;

public class ClassMohamed {


    public static void main(String args[])
    {
      int h, m, s, duree;
      System.out.println("Saisie d'un horaire");
      System.out.println("Donnez les heures");
      h = Clavier.lireInt();
      System.out.println ("Donnez les minutes");
      m = Clavier.lireInt(); 
      System.out.println("Donnez les secondes");
      s = Clavier.lireInt();
      duree = conversionHMS2S(h, m, s);
      System.out.println("Cet horaire dure " + duree 
                         + " secondes.");
    }

}
