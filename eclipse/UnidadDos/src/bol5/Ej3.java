package bol5;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca 1 para calcular el área o 2 para calcular el volumen");
		
		sc.close();
	}
	static void cilindro(int tipo) {
		Scanner sc = new Scanner(System.in);
		float pi = 3.14f;
		float resultado;
		System.out.println("Introduzca el radio de la base");
		int base = sc.nextInt();
		System.out.println("Introduzca la altura");
		int altura = sc.nextInt();
		sc.close();
		if (tipo == 1) {
			resultado = 2 * pi * base * (altura + base);
			System.out.println(resultado+"cm^2");
		}
		else {
			resultado = pi * base * base * altura;
			System.out.println(resultado+"cm^3");
		}
	}
}
