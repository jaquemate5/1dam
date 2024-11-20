package bol4;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int current = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte la altura de los árboles y devolveremos la posición del más alto empezando por el 0");
		int h = sc.nextInt();
		int numh = h;
		while (h != -1) {
			if (numh < h) {
				numh = h;
				num = current;
			}
		current = current + 1;
		h = sc.nextInt();
		}
		System.out.println("El más alto es el número "+num+" con una altura de "+numh+" cm");
		sc.close();
	}

}
