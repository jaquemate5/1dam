package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int table [];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int avg = 0;
		table = new int [5];
		for (int i = 0; i < table.length; i++) {
			System.out.println("Inserte el valor entero de la posición: "+i);
			table[i] = sc.nextInt();
		}
		System.out.println("La tabla será mostrada a continuación");
		System.out.println(Arrays.toString(table));
		System.out.println("1. Encontrar el máximo");
		System.out.println("2. Encontrar el mínimo");
		System.out.println("3. Hacer la media");
		int choice = sc.nextInt();
		switch(choice) {
		case 2:
			for (int i = 0; i < table.length; i++) {
				if (min > table[i]) {
					min = table[i];
				}
			}
			System.out.println(min);
			break;
		case 1:
			for (int i = 0; i < table.length; i++) {
				if (max > table[i]) {
					max = table[i];
				}
			}
			System.out.println(max);
			break;
		case 3:
			for (int i = 0; i < table.length; i++) {
				avg = avg + table[i];
			}
			avg = avg/table.length;
			System.out.println(avg);
		}
			
		sc.close();
		
	}

}
