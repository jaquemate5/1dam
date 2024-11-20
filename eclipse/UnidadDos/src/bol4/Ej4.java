package bol4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte el número hasta el que vamos a contar");
		int num = sc.nextInt();
		int cont = 0;
		sc.close();
		while (cont < num) {
			cont = cont + 1;
			System.out.println(cont);
		}
	}

}
