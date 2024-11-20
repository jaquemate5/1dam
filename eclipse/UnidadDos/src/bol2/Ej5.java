package bol2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca tres enteros para comparar");
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		long mayor = sc.nextLong();
		sc.close();
		if(num1 > mayor) {
			mayor = num1;
		}
		if (num2 > mayor) {
			mayor = num2;
		}
		System.out.println("El mayor es el "+mayor);
	}

}
