package bol4;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cond = 0;
		int susp = 0;
		int apr = 0;
		int nota;
		for (int i = 1; i <= 6; i++) {
			nota = sc.nextInt();
			if (nota < 5) {
				if (nota < 4) {
					susp = susp + 1;
				}
				else {
					cond = cond + 1;
				}
			}
			else {
				apr = apr + 1;
			}
		}
		sc.close();
		System.out.println("Aprobados: "+apr);
		System.out.println("Suspensos: "+susp);
		System.out.println("Condicionados: "+cond);
	}

}
