package bolexamen2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numarbol;
		float diametro;
		float mindia = 0;
		float maxdia = 0;
		float altura;
		int edad = 0;
		int sumedad = 0;
		float maxalt = 0;
		float minalt = 0;
		int cont = 0;
		System.out.println("Ahora el número de árboles");
		numarbol = sc.nextInt();
		for (int i = 0; i < numarbol; i++) {
			System.out.println("Inserte el tipo del árbol a introducir");
			String tipo = sc.next();
			System.out.println("Inserte el diámetro y la altura");
			diametro = sc.nextFloat();
			if (diametro > maxdia) {
				maxdia = diametro;
			}
			if (diametro < mindia || mindia == 0) {
				mindia = diametro;
			}
			altura = sc.nextFloat();
			if (maxalt < altura) {
				maxalt = altura;
			}
			if (minalt > altura || minalt == 0) {
				minalt = altura;
			}
			if (tipo.equals("B")) {
				System.out.println("Ahora la edad del árbol");
				edad = sc.nextInt();
				sumedad = sumedad + edad;
				cont++;
			}

		}
		sc.close();
		System.out.println("Diámetro máximo: "+maxdia);
		System.out.println("Diámetro mínimo: "+mindia);
		System.out.println("Altura máxima: "+maxalt);
		if (maxalt >= 30) {
			System.out.println("Por tanto, hay árboles de al menos 30 m");
		}
		System.out.println("Altura mínima "+minalt);
		System.out.println("La media de las edades de los árboles de tipo B es: "+sumedad/cont);
	}

}
