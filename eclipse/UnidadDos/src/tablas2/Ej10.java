package tablas2;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[];
		tabla = new int[3];
		System.out.println("Impares desechados: "+RellenaPares(tabla));
	}
	public static int RellenaPares(int t[]) {
		int cont = 0;
		int i = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		while (i < t.length) {
			System.out.println("Posición "+i);
			num = sc.nextInt();
			if (num % 2 == 0) {
				t[i] = num;
				i++;
			}
			else {
				cont++;
			}
		}
		sc.close();
		return cont;
	}
}