package tablas;

import java.util.Scanner;

public class TareasApoyo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int [6];
		System.out.println("Inserte una tabla");
		for (int i = 0; i < 6; i++) {
			tabla[i] = sc.nextInt();
		}
		System.out.println(getIndexOfOrdenado(tabla, 99));
		sc.close();
	}
	public static int buscar(int t[]) {
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		System.out.println("Inserte el número a buscar");
		int num = sc.nextInt();
		int pos = -1;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == num) {
				found = true;
				pos = i;
			}
		}
		if (found == false) {
			pos = -1;
		}
		sc.close();
		return pos;
	}
	public static int getIndexOfOrdenado(int[]t, int elemBuscado) {
		int i = 0;
		while (i < t.length && t[i] < elemBuscado) {
			i++;
		}
		if (i < t.length) {
			if (t[i] > elemBuscado) {
				i = -i;
			}
		}
		else if (i > (t.length - 1)) {
			i = -i;
		}
		return i;
	}
	
	public static int[] ordenatablaborradaindice(int[]t, int indice) {
		int tabla[];
		tabla = new int [t.length-1];
		for (int i = indice; i < tabla.length; i++) {
			tabla[i] = t[i+1];
		}
		return tabla;
	}
}
