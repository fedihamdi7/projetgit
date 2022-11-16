package com.alinfo5.projetgit;

public class Classahmed {

	public static int Calculsoustraction(int a, int b) {
		return a - b;
	}

	public static void parite(Double a) {
		if (a % 2 == 0) {
			System.out.println(a + " est un nombre pair");

		} else {
			System.out.println(a + " est un nombre impair");

		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Calculsoustraction(6, 5));
	}

}
