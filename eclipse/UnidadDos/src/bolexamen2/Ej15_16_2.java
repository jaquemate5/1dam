package bolexamen2;

import java.util.Scanner;

public class Ej15_16_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String check = "";
		String siguiente = "";
		String despues = "";
		String palabra;
		int cont = 0;
		System.out.println("Inserte palabras para comprobar o fin para terminar");
		palabra = sc.next();
		while (!palabra.equals("fin")) {
			check = siguiente;
			siguiente = despues;
			despues = palabra;
			if (check.length()<siguiente.length() && check.length()<despues.length() && !check.equals("")) {
				cont = cont + 1;
			}
			palabra= sc.next();
		}
		
		sc.close();
		System.out.println("Palabras más cortas que las dos siguientes: "+cont);

	}

}
