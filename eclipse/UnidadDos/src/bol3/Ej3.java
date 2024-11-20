package bol3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
			int menor = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca dos números a comparar");
			byte num1 = sc.nextByte();
			byte num2 = sc.nextByte();
			if (num1 > num2){
				menor = 2;
			}
			else {
				menor = 1;
			}
			System.out.println("El número de la posición "+menor+ " es menor");
			sc.close();
	}

}
/*
public class Ej3 {

	public static void main(String[] args) {
			int menor = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca dos números a comparar");
			byte num1 = sc.nextByte();
			byte num2 = sc.nextByte();
			menor = (num1 > num2) ? 2 : 1
			System.out.println("El número de la posición "+menor+ " es menor");
			sc.close();
	}

}

 */
