package tablas2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apuesta[];
		apuesta = new int [6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < apuesta.length; i++) {
			System.out.println("Inserte la apuesta de posición "+i);
			apuesta[i] = sc.nextInt();
		}
		sc.close();
		int resultado[];
		resultado = new int[6];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = (int) (Math.random()*48+1);
		}
		System.out.println("Este ha sido el resultado");
		System.out.println(Arrays.toString(resultado));
		System.out.println("Por tanto, tus aciertos son:");
		System.out.println(compara(apuesta, resultado));
	}
	public static int compara(int t1[], int t2[]) {
		int aciertos = 0;
		boolean taken;
		for (int i = 0; i<t1.length; i++) {
			taken = false;
			for (int j = 0; j < t2.length; j++) {
				if (taken == false && t1[i] == t2[j]) {
					taken = true;
					aciertos++;
				}
			}
		}
		return aciertos;
	}
}
