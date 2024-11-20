package bol4;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		System.out.println("Inserte 5 notas");
		for (int i = 1; i <= 5; i++) {
			int nota = sc.nextInt();
			if (nota < 5) {
				cont = cont + 1;
			}
		}
		sc.close();
		if (cont == 0) {
			System.out.println("Sin suspensos");
		}
		else {
			System.out.println("Hay suspensos");
		}
	}

}
