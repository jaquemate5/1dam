package bol2;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		final double GRAVEDAD = 9.8;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tiempo de caída en segundos");
		int tiempo = sc.nextInt();
		sc.close();
		double v = GRAVEDAD * tiempo;
		System.out.println("La velocidad será de "+v);
	}
}
