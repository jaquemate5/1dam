package bolexamen2;

import java.util.Scanner;

public class Ej1_17_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombrejugador = "";
		String nombreequipo = "";
		float puntos = 0;
		int edad;
		int preciofichaje;
		char posicion = 'A';
		int goles = 0;
		int penalti = 0;
		float mediaedaddefensa = 0;
		int contdefensa = 0;
		int maxprecio7 = Integer.MIN_VALUE;
		String jugadorcaro = "";
		float eficiencia = Integer.MIN_VALUE;
		String equipoeficiente = "";
		int numjugadores;
		boolean porterolateral = false;
		System.out.println("Introduzca el nombre del equipo");
		nombreequipo = sc.next();
		while(!nombreequipo.equals("Fin")) {
			System.out.println("Introduzca los puntos del equipo");
			puntos = sc.nextFloat();
			System.out.println("Introduzca el número de jugadores de este equipo");
			numjugadores = sc.nextInt();
				for (int i = 0; i < numjugadores; i++) {
					System.out.println("Introduzca el nombre del jugador");
					nombrejugador = sc.next();
					System.out.println("Introduzca la edad del jugador");
					edad = sc.nextInt();
					System.out.println("Introduzca el precio de fichaje");
					preciofichaje = sc.nextInt();
					System.out.println("Introduzca su posición");
					posicion = sc.next().charAt(0);
					if (posicion == 'D') {
						System.out.println("Introduzca el número de goles");
						goles = sc.nextInt();
					}
					else if (posicion == 'P') {
						System.out.println("Introduzca el número de penaltis parados");
						penalti = sc.nextInt();
						porterolateral = true;
					}
					else if (posicion =='F') {
						mediaedaddefensa = mediaedaddefensa + edad;
						contdefensa++;
					}
					else if (posicion == 'L') {
						porterolateral = true;
					}
					if (numjugadores < 7) {
						if (maxprecio7 < preciofichaje) {
							maxprecio7 = preciofichaje;
							jugadorcaro = nombrejugador;
						}
					}
					
					
				}
			if (puntos / numjugadores > eficiencia) {
				eficiencia = puntos/numjugadores;
				equipoeficiente = nombreequipo;
			}
			if (!porterolateral) {
				System.out.println("Este equipo no tiene porteros ni laterales");
			}
			System.out.println("Introduzca otro equipo o fin para terminar");
			nombreequipo = sc.next();
			
		}
		
		sc.close();
		mediaedaddefensa = mediaedaddefensa/contdefensa;
		System.out.println("Media de edad de todos los defensas (en años): "+mediaedaddefensa);
		System.out.println("El jugador más caro de equipos de menos de 7 personas es: "+jugadorcaro);
		System.out.println("El equipo más eficiente es: "+equipoeficiente);
	}

}
