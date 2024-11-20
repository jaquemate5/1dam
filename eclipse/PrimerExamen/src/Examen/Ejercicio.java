package Examen;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		boolean nasa = false;
		boolean esa = false;
		boolean jaxa = false;
		float diaspromedios = 0;
		float temperaturadia;
		String robot;
		char agenciarobot;
		float temperaturamaxima = Float.MIN_VALUE;
		String robottemperaturamaxima = "";
		int misiontemperaturamaxima = 0;
		float presiondia = 0;
		float sumapresionmision = 0;
		float presionmediarobot;
		float menorpresionmedia = Float.MAX_VALUE;
		String robotmenorpresionmedia = "";
		float radiaciondia;
		float menorradiacion = Float.MIN_VALUE;
		float segundamenorradiacion = Float.MAX_VALUE;
		int diasmision = 0;
		int diaactual;
		int contdiaspresion = 0;
		int misionesrobot = 1;
		int contmisiones = 0;
		float misionesmasde5dias = 0;
		int misionrobottemperatura = 1;
		String planeta;
		int lengthplaneta = -1;
		String planetanombrelargo = "";
		int contplanetanombrelargo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de robots enviados");
		int numrobots = sc.nextInt();
		for (int i = 1; i <= numrobots; i++) {
			System.out.println("Inserte el nombre del robot a almacenar");
			robot = sc.next();
			agenciarobot = robot.charAt(0);
			if (agenciarobot == 'N') {
				nasa = true;
			} else if (agenciarobot == 'E') {
				esa = true;
			} else if (agenciarobot == 'J') {
				jaxa = true;
			}
			System.out.println("Inserte el planeta correspondiente a este robot");
			planeta = sc.next();
			misionesrobot = 1;
			if (planeta.length() > lengthplaneta) {
				lengthplaneta = planeta.length();
				planetanombrelargo = planeta;
				contplanetanombrelargo = 0;
			}
			System.out.println("Número de días de registro para la misión " + misionesrobot + " (-1 para finalizar)");
			diasmision = sc.nextInt();
			while (diasmision != -1) {
				diaspromedios = diaspromedios + diasmision;
				if (diasmision > 5) {
					misionesmasde5dias++;
				}
				contmisiones++;
				if (planeta.equals(planetanombrelargo)) {
					contplanetanombrelargo++;
				}
				for (diaactual = 1; diaactual <= diasmision; diaactual++) {
					System.out.println("Día " + diaactual);
					System.out.println("Temperatura: ");
					temperaturadia = sc.nextFloat();
					if (temperaturadia > temperaturamaxima) {
						temperaturamaxima = temperaturadia;
						robottemperaturamaxima = robot;
						misiontemperaturamaxima = misionrobottemperatura;
					}
					System.out.println("Presión: ");
					presiondia = sc.nextFloat();
					sumapresionmision = sumapresionmision + presiondia;

					System.out.println("Radiación: ");
					radiaciondia = sc.nextFloat();
					if (radiaciondia < menorradiacion) {
						menorradiacion = radiaciondia;
					} else if (radiaciondia < segundamenorradiacion) {
						segundamenorradiacion = radiaciondia;
					}
					misionrobottemperatura++;
					contdiaspresion++;
				}
				misionrobottemperatura = 1;
				misionesrobot++;
				System.out
						.println("Número de días de registro para la misión " + misionesrobot + " (-1 para finalizar)");
				diasmision = sc.nextInt();
			}
			presionmediarobot = sumapresionmision / contdiaspresion;
			if (presionmediarobot < menorpresionmedia) {
				menorpresionmedia = presionmediarobot;
				robotmenorpresionmedia = robot;
			}
			contdiaspresion = 0;
		}
		diaspromedios = diaspromedios / contmisiones;

		sc.close();
		System.out.println("Como media, una misión dura " + diaspromedios + " días");
		if (nasa == false || esa == false || jaxa == false) {
			System.out.println("No hay robots de las tres empresas");
		} else {
			System.out.println("Hay robots de las tres empresas");
		}
		System.out.println("La temperatura máxima ha sido de " + temperaturamaxima + " grados; registrada por el robot "
				+ robottemperaturamaxima + "en la misión " + misiontemperaturamaxima);
		System.out
				.println("El robot con un registro menor de presión media en el planeta es: " + robotmenorpresionmedia);
		System.out.println("Los dos menores valores de radiación registrados son " + menorradiacion + " y "
				+ segundamenorradiacion);
		System.out.println(
				"El procentaje de misiones de más de 5 días es: " + misionesmasde5dias / contmisiones * 100 + " %");
		System.out.println(
				"El planeta con el nombre más largo ha sido el lugar de " + contplanetanombrelargo + " misiones");
	}
}
