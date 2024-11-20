package bol4;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int choice = sc.nextInt();
		while (choice != 0) {
			if (choice % 2 == 0) {
				System.out.println("Par");
			}
			else {
				System.out.println("Impar");
			}
			if (choice > 0) {
				System.out.println("Positivo");
			}
			else {
				System.out.println("Negativo");
			}
			System.out.println("Cuadrado: "+choice*choice);
			System.out.println("Introduzca otro número o 0 para terminar");
			choice = sc.nextInt();
		}
		sc.close();
	}

}
