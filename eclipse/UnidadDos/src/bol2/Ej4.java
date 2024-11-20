package bol2;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int recuento = 0;
		System.out.println("Inserte dos números enteros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		if (num1 % 2 == 0) {
			recuento = recuento + 1;
		}
		if (num2 % 2 == 0) {
			recuento = recuento + 1;
		}
		System.out.println("Cantidad de números pares: "+recuento);
	}
}
