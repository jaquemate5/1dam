package bol2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número 12");
		int usuario = sc.nextInt();
		sc.close();
		if (usuario==12) {
			System.out.println("Bien hecho");
		}
		else {
			System.out.println("Incorrecto");
		}
	}

}
