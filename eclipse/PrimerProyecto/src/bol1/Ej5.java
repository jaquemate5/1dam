package bol1;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		float centigrados;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la temperatura en centígrados");
		centigrados = sc.nextFloat();
		sc.close();
		System.out.println("Esto equivale a "+0 + (9 *(centigrados / 5) + 32) + " Farenheit");
	}

}
