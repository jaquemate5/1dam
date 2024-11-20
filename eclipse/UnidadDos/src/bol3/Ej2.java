package bol3;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			int par;
//			System.out.println("Introduzca un número entero, devolveremos 1 si es par o 0 si es impar");
//			int num = sc.nextInt();
//			int mod = num%2;
//			if (mod == 0){
//				par = 1;
//			}
//			else {
//				par = 0;
//			}
//			System.out.println(par);
//			sc.close();

		/*
		 * Scanner sc = new Scanner(System.in); int par; System.out.
		 * println("Introduzca un número entero, devolveremos 1 si es par o 0 si es impar"
		 * ); int num = sc.nextInt(); int mod = num%2; par = (mod==1)? 0 : 1
		 * System.out.println(par); sc.close();
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int par;
		System.out.println("Introduzca un número entero, devolveremos 1 si es par o 0 si es impar");
		int num = sc.nextInt();
		par = (num + 1) % 2;
		System.out.println(par);
		sc.close();
	}
}