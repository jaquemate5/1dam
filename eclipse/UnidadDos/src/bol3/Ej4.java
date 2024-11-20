package bol3;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float PI = 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el radio");
		int radio = sc.nextInt();
		System.out.println("1. Calcular diámetro");
		System.out.println("2. Calcular perímetro");
		System.out.println("3. Calcular área");
		int choice = sc.nextInt();
		sc.close();
		switch (choice) {
		case 1:
			int dia = 2*radio;
			System.out.println("El diámetro es de "+dia);
			break;
		case 2:
			float per = 2*radio*PI;
			System.out.println("El perímetro es de "+per);
			break;
		case 3:
			float area = radio*radio*PI;
			System.out.println("El área es de "+area);
			break;
		default:
			System.out.println("Error, option not possible for this humble calculator");
			break;
			
		}
	}

}
