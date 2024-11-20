package bolexamen2;

import java.util.Scanner;

public class Ej2_17_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int cont = 0;
		int contnum = 0;
		int maxcad = 0;
		boolean contar = true;
		System.out.println("Introduzca tres números");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		while (num1 >= 0) {
			if (num3 > num2 && num2 > num1) {
				if (contar == true) {
					cont = cont + 1;
					contar = false;
					contnum = 3;
				}
				else {
					contnum++;
				}
			}
			maxcad = contnum;
			num3 = num2;
			num2 = num1;
			num1 = sc.nextInt();
		}
		System.out.println("El número de cadenas es: "+cont);
		System.out.println("La cadena más larga es de: "+maxcad);
		sc.close();
	}

}
