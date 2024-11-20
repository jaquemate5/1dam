package bol3;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Para ax^2+bx+c=0, introduzca la a, la b y la c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double raiz = Math.sqrt(b*b-(4*a*c));
		if (raiz < 0) {
			System.out.println("No hay soluciones reales");
		}
		if (raiz == 0) {
			double sol = (-1*b)/(4*a);
			System.out.println("Única solución: "+sol);
		}
		if (raiz > 0) {
			double sol = ((-1*b)+raiz)/(4*a);
			System.out.println("Primera solución: "+sol);
			sol = ((-1*b)-raiz)/(4*a);
			System.out.println("Segunda solución: "+sol);
		}
		sc.close();
	}

}
