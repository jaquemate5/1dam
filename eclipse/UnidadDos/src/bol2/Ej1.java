package bol2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un entero");
		int entero = sc.nextInt();
		sc.close();
		if (entero > 0){
			System.out.println("El número es positivo");
		}
		else {
			System.out.println("El número no es positivo");
		}
	}

}
