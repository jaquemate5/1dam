package bolexamen2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Grupo a evaluar? (en mayúsculas)");
		String grupo = sc.next();
		int alumnos = 0;
		float nota;
		String mayormedia ="";
		float nummayormedia = 0;
		float media = 0;
		float sum;
		String nombre;
		if (grupo.equals("A")) {
			alumnos = 25;
		}
		if (grupo.equals("B")) {
			alumnos = 28;
		}
		if (grupo.equals("C")) {
			alumnos = 31;
		}
		if (grupo.equals("D")) {
			alumnos = 29;
		}
		for (int i = 1; i <= alumnos; i++) {
			sum = 0;
			System.out.println("Inserte el nombre del alumno "+i+" y sus tres notas");
			nombre = sc.next();
			for(int j = 0; j < 3; j++) {
				nota = sc.nextFloat();
				sum = sum + nota;
			}
			media = sum / 3;
			if (media > nummayormedia) {
				mayormedia = nombre;
			}
			
		}
		sc.close();
		if (nummayormedia >= 9) {
			System.out.println("Existen sobresalientes");
		}
		System.out.println("La mayor media pertenece a "+mayormedia);

	}

}
