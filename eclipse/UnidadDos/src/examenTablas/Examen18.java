package examenTablas;

import java.util.Scanner;

public class Examen18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int votos[][];
		votos = new int [30][20];
		String codlocalidad[];
		codlocalidad = new String [30];
		Scanner sc = new Scanner(System.in);
		String codpartido[];
		codpartido = new String [20];
		int partidoalfabeticoindice[][][];
		partidoalfabeticoindice = new int [20][30][3];
		int localidades = 0;
		int partido = 0;
		boolean vacio = false;
		String nombrepartido;
		String nombrelocalidad;
		boolean repetido = false;
		int mejorresultado = 0;
		int masvotos = 0;
		System.out.println("1. Introducir votos obtenidos en una ciudad por un partido");
		System.out.println("2. Listado alfabético por partidos de todos los datos introducidos");
		System.out.println("3. Mejores resultados de cada partido");
		System.out.println("4. Listado de localidades de menor a mayor participación");
		System.out.println("5. Porcentaje de votos obtenido por cada partido en la comunidad");
		System.out.println("6. Fin");
		int opcion = sc.nextInt();
		while (opcion != 6) {
			switch(opcion) {
			case 1:
				System.out.println("Inserte la localidad a introducir");
				nombrelocalidad = sc.next();
				localidades = 0;
				vacio = false;
				repetido = false;
				while (repetido == false & vacio == false & localidades < 30 & codlocalidad[localidades] != nombrelocalidad) {
					if (codlocalidad[localidades] == null) {
						vacio = true;
					}
					if (codlocalidad[localidades] == nombrelocalidad) {
						repetido = true;
					}
					localidades++;
				}
				if (repetido == false) {
					codlocalidad[localidades-1] = nombrelocalidad;
				}
				
				
				System.out.println("Inserte el partido a introducir en dicha localidad");
				nombrepartido = sc.next();
				partido = 0;
				vacio = false;
				repetido = false;
				while (repetido == false & vacio == false & partido < 20 & codpartido[partido] != nombrepartido) {
					if (codpartido[partido] == null) {
						vacio = true;
					}
					if (codpartido[partido] == nombrepartido) {
						repetido = true;
					}
					partido++;
				}
				if (repetido == false) {
					codpartido[partido-1] = nombrepartido;
				}
				
				
				System.out.println("Inserte el número de votos del partido");
				votos[localidades-1][partido-1] = sc.nextInt();
				break;
			case 2:
				for (int i = 0; i < codpartido.length; i++) {
					partidoalfabeticoindice[i][0][0] = i;
					for (int j = 0; j < codlocalidad.length; j++) {
						partidoalfabeticoindice[i][j][0] = j;
						partidoalfabeticoindice[i][j][1] = votos[i][j];
					}
				}
				break;
			case 3:
				for (int i = 0; i < votos.length; i++) {
					mejorresultado = 0;
					masvotos = 0;
					for (int j = 0; j < votos[i].length; j++) {
						if (votos[i][j] > masvotos) {
							masvotos = votos[i][j];
							mejorresultado = j;
						}
					}
					System.out.println("El partido "+codpartido[i]+" ha obtenido más votos en "+codlocalidad[mejorresultado]);
				}
				break;
			case 4:
			}
		}

		sc.close();
	}

}
