package bol4;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.floor(Math.random()*100 + 1));
		Scanner sc = new Scanner(System.in);
		int choice = 101;
		System.out.println("Intente obtener el mismo número del 1 al 100 que el programa. Pulse -1 para rendirse.");
		while (choice != -1 && choice != num) {
			choice = sc.nextInt();
			if (choice == num) {
				System.out.println("Correcto");
			}
			else {
				if (choice < num && choice != -1) {
					System.out.println("Pruebe con uno mayor");
				}
				else {
					if (choice !=-1) {
						System.out.println("Pruebe con uno menor");
					}
				}
			}
		}
		sc.close();
	}

}
