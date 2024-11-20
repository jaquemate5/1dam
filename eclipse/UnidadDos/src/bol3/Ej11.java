package bol3;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta una fecha en el formato d-m-y");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		d = d + 1;
		if (d>30) {
			d = d-30;
			m = m + 1;
			if (m>12) {
				m = m-12;
				y = y + 1;
			}
		}
		System.out.println("El día siguiente es "+d+"-"+m+"-"+y);
	}

}