package bol1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		System.out.println("Introduzca dos números");
		float num1;
		float num2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		sc.close();
		System.out.println("La media es: " + (num1 + num2)/2);
	}

}
