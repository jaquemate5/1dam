package bol4;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		int suma = 0;
		float media = 0;
		int legal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte edades para almacenar o un número negativo para terminar");
		int age = sc.nextInt();
		while (age >= 0) {
			cont = cont + 1;
			suma = suma + age;
			if (age >= 18) {
				legal = legal + 1;
			}
		System.out.println("Procesado. Introduzca otro alumno");
		age = sc.nextInt();
		}
		media = suma / cont;
		System.out.println("La media de edad de los "+cont+" alumnos es de "+media+" años; mientras que la suma es de "+suma+" y hay "+legal+" alumnos mayores de edad");
		sc.close();
	}

}
