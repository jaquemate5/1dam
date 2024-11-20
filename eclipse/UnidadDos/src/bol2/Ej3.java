package bol2;

import java.util.Scanner;

public class Ej3 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		int num = sc.nextInt();
		sc.close();
		if (num%2 == 0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
	}
}
