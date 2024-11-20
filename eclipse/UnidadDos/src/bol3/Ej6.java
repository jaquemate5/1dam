package bol3;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int salario = 0;
		System.out.println("Introduzca las horas trabajadas");
		int horas = sc.nextInt();
		if (horas<41) {
			salario = horas * 12;
		}
		else {
			salario = (40*12) + (horas-40)*16;
		}
		System.out.println("Gracias por ser explotado. Para minimizar las quejas, pagaremos la siguiente suma (en euros): "+salario);
		sc.close();
	}

}
