package bol4;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número del 1 al 10");
		int tabla = sc.nextInt();
		while (tabla < 1 || tabla > 10) {
			System.out.println("No acepto números negativos, 0 o mayores que 10");
			tabla = sc.nextInt();
		}
		sc.close();
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = value + tabla;
			System.out.println(value);
		}
	}

}
