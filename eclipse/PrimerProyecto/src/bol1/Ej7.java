package bol1;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float base;
		float altura;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la base y la altura");
		base = sc.nextFloat();
		altura = sc.nextFloat();
		float area = (base * altura / 2);
		System.out.println("El área es de " + area);
		sc.close();
	}

}
