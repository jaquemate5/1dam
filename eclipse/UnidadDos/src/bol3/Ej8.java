package bol3;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int puntos = 0;
		System.out.println("El modelo entidad-relación evolucionó al modelo relacional");
		System.out.println("a) Verdadero");
		System.out.println("b) Falso");
		char respuesta = sc.next().charAt(0);
		if (respuesta=='b') {
			puntos = puntos + 1;
		}
		System.out.println("En complemento a 2, podemos ir de derecha a izquierda y complementar todos los números después del primer 1");
		System.out.println("a) Verdadero");
		System.out.println("b) Falso");
		respuesta = sc.next().charAt(0);
		if (respuesta == 'a') {
			puntos = puntos + 1;
		}
		System.out.println("Todo lo que se puede hacer con un FOR se puede hacer con un WHILE");
		System.out.println("a) Verdadero");
		System.out.println("b) Falso");
		respuesta = sc.next().charAt(0);
		if (respuesta == 'a') {
			puntos = puntos + 1;
		}
		System.out.println("El modelo entidad relación fue ideado por Sun-Tzu");
		System.out.println("a) Verdadero");
		System.out.println("b) Falso");
		respuesta = sc.next().charAt(0);
		if (respuesta == 'b') {
			puntos = puntos + 1;
		}
		System.out.println("Nos venden Tebibytes en vez de Terabytes");
		System.out.println("a) Verdadero");
		System.out.println("b) Falso");
		respuesta = sc.next().charAt(0);
		if (respuesta == 'b') {
			puntos = puntos + 1;
		}
		sc.close();
		System.out.println("Puntuación: "+puntos);
	}

}
