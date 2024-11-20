package bol4;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número máximo para calcular primos");
		int cap = sc.nextInt();
		int check;
		sc.close();
		int primos = 0;
		for (int i = 2; i <= cap; i++) {
			check = 1;
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {
					check = 0;
				}
				
			}
			if (check == 1) {
				System.out.println(i+" es primo");
				primos++;
			}

		}
		System.out.println("Hasta el número elegido hay "+primos+" primos");
	}

}
