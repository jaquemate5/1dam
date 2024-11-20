package bol1;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		float n1;
		float n2;
		float n3;
		float n4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cuatro números");
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		float media = (n1 + n2 + n3 + n4)/4;
		System.out.println("La media es " + media);
		sc.close();
	}

}
