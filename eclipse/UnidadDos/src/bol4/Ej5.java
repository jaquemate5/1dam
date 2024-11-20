package bol4;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte el rango numérico (mínimo y máximo)");
		int min = sc.nextInt();
		int max = sc.nextInt();
		System.out.println("Ahora intente introducir un número dentro del rango");
		int num = sc.nextInt();
		while (num < min || num > max) {
			System.out.println("I refuse to believe that. Add another number");
			num = sc.nextInt();
		}
		sc.close();
		System.out.println("Bien hecho");
	}

}
