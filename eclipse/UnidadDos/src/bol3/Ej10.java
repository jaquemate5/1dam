package bol3;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte un día, mes y año en números");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		sc.close();
		switch (month) {
		case 1:
			if (day<32) {
				System.out.println("Existe");
				break;
			}
		case 2:
			if (day<29) {
				System.out.println("Existe");
				break;
			}
		case 3:
			if (day < 32) {
				System.out.println("Existe");
				break;
			}
		case 4:
			if (day < 31) {
				System.out.println("Existe");
				break;
			}
		case 5:
			if (day < 32) {
				System.out.println("Existe");
				break;
			}
		case 6:
			if (day<31) {
				System.out.println("Existe");
				break;
			}
		case 7:
			if (day<32) {
				System.out.println("Existe");
				break;
			}
		case 8:
			if (day<32) {
				System.out.println("Existe");
				break;
			}
		case 9:
			if (day<31) {
				System.out.println("Existe");
				break;
			}
		case 10:
			if (day<32) {
				System.out.println("Existe");
				break;
			}
		case 11:
			if (day<31) {
				System.out.println("Existe");
				break;
			}
		case 12:
			if (day<32) {
				System.out.println("Existe");
				break;
			}
		default:
			System.out.println("realn't");
		}
		System.out.println("Aunque hayas puesto el año "+year+", no sirve para nada en el código. Esto está escrito para que no salga el aviso");
	}

}
