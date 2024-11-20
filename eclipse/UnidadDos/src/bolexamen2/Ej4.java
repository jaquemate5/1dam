package bolexamen2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numprovincias = 0;
		boolean max_abs = false;
		String provincia;
		String provinciaA="";
		String provinciaB="";
		int maxA = -1;
		int votosA = -1;
		int totalA = 0;
		int maxB = -1;
		int votosB= -1;
		int totalB = 0;
		int abs = 0;
		int totalabs = 0;
		System.out.println("Número de la región (del 1 al 4)");
		int region = sc.nextInt();
		switch(region) {
		case 1:
			numprovincias = 10;
			break;
		case 2:
			numprovincias = 4;
			break;
		case 3:
			numprovincias = 6;
			break;
		case 4:
			numprovincias = 1;
			break;
		}
		for (int i = 0; i < numprovincias; i++) {
			System.out.println("Introduzca el nombre de la provincia "+i+1);
			provincia = sc.next();
			System.out.println("Introduzca, en este orden, el número de votos del partido A, el del partido B y el número de abstenciones");
			votosA = sc.nextInt();
			totalA = totalA + votosA;
			if (votosA > maxA) {
				maxA = votosA;
				provinciaA = provincia;
			}
			votosB = sc.nextInt();
			totalB = totalB + votosB;
			if (votosB > maxB) {
				maxB = votosB;
				provinciaB = provincia;
			}
			abs = sc.nextInt();
			totalabs = totalabs + abs;
			if (abs > 100000) {
				max_abs = true;
			}
		}
		sc.close();
		System.out.println("El total de votos del partido A ha sido del "+totalA/(totalA+totalB+totalabs)*100+"%");
		System.out.println("El total de votos del partido B ha sido del "+totalB/(totalA+totalB+totalabs)*100+"%");
		System.out.println("El total de abstenciones ha sido del "+totalabs/(totalA+totalB+totalabs)*100+"%");
		System.out.println("La provincia donde más votos ha obtenido el partido A es " +provinciaA);
		System.out.println("La provincia donde más votos ha obtenido el partido B es " +provinciaB);
		if(max_abs) {
			System.out.println("Alata abstención");
		}
	}

}
