package bol1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		float millas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca las millas a calcular");
		millas = sc.nextFloat();
		float metros = millas * 1609;
		System.out.println("Eso son " + metros + " metros");
		sc.close();
		}

}
