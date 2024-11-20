package bolexamen2;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int piezas = 0;
		int dia = 0;
		int total = 0;
		int max = 0;
		int min = 0;
		int mes = sc.nextInt();
		switch(mes) {
		case 1,3,5,7,8,10,12:
			dia = 31;
			break;
		case 4,6,9,11:
			dia = 30;
			break;
		case 2:
			dia = 28;
			break;
		default:
				System.out.println("Mes no válido");
		}
		if (dia != 0) {
			for (int i = 0; i < dia; i++) {
				System.out.println("Inserte el número de piezas de hoy");
				piezas = sc.nextInt();
				total = piezas + total;
				if (piezas > max) {
					max = piezas;
				}
				if (piezas < min || min == 0) {
					min = piezas;
				}
			}
			sc.close();
			System.out.println("Máximo de piezas en un día: "+max);
			System.out.println("Mínimo de piezas en un día: "+min);
			if (min < 300) {
				System.out.println("Hay días bajo mínimo. Bajando sueldo");
			}
			System.out.println("Este mes se han producido "+total+" piezas");
		}

	}

}
