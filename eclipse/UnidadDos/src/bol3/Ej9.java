package bol3;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número del 0 al 9999");
		int num = sc.nextInt();
		sc.close();
		if (num<10) {
			System.out.println("1 cifra");
		}
		else {
			if (num<100) {
				System.out.println("2 cifras");
			}
			else {
				if (num<1000) {
					System.out.println("3 cifras");
				}
				else {
					if (num<10000) {
						System.out.println("4 cifras");
					}
					else {
						System.out.println("Out of range");
					}
				}
			}
		}
	}

}
