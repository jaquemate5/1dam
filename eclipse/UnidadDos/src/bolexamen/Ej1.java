package bolexamen;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte números enteros positivos para añadirlos a los datos o uno negativo para terminar");
		int cont = 0;
		float cont5 = 0f;
		int num = sc.nextInt();
		float suma = 0;
		int max = num;
		int min = num;
		int mayor = 0;
		while (num >= 0) {
			cont = cont + 1;
			suma = suma + num;
			if (num <= 5) {
				cont5 = cont5 + 1;
			}
			if (max < num) {
				max = num;
			}
			if (min > num) {
				min = num;
			}
			if (num > 100) {
				mayor = 1;
			}
			num = sc.nextInt();
		}
		sc.close();
		float percent = cont5/cont*100;
		System.out.println("El "+percent+"% de los números introducidos es menor que 5");
		if (mayor == 1) {
			System.out.println("Hay al menos un número mayor que 100");
		}
		else {
			System.out.println("Ningún número era mayor que 100");
		}
		System.out.println("Mínimo: "+min);
		System.out.println("Máximo: "+max);
		System.out.println("Media aritmética: "+suma/cont);

	}

}
