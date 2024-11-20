package tablas2;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int clase[][] = new int [3][5];
		for (int i = 0; i < clase.length; i++) {
			for (int j = 0; j < clase[0].length; j++) {
				System.out.println("Introduzca la nota del alumno "+(j+1)+" en el trimestre "+(i+1));
				clase[i][j] = sc.nextInt();
			}
		}
		float sumanota;
		for (int i = 0; i < clase.length; i++) {
			sumanota = 0;
			for (int j = 0; i < clase[0].length; j++) {
				sumanota = sumanota + clase[i][j];
			}
			System.out.println("La nota media del grupo en el trimestre "+(i+1)+" es de "+sumanota/5);
		}
		System.out.println("Ahora introduzca el número de un alumno por teclado y calcularemos su media");
		int pos = sc.nextInt();
		float mediaalumno = 0;
		for (int i = 0; i < clase.length; i++) {
			mediaalumno = mediaalumno + clase[i][pos];
		}
		mediaalumno = mediaalumno/3;
		System.out.println("Su media es de "+mediaalumno);
		sc.close();
	}

}
