package bolexamen2;

import java.util.Scanner;

public class E15_16 {

	public static void main(String[] args) {
		System.out.println("Inserte el código de la entidad educativa");
		char type = 'A';
		String nom = "";
		int profdpto;
		String alumno = "";
		float media = 0;
		float mediaclase = 0;
		String clasemasmedia = "";
		float sumsubject = 0;
		int contbach = 0;
		String clase ="";
		float subject = 0;
		int contalum = 0;
		int dur = 0;
		int sumperm = 0;
		int maxprof = 0;
		int contmil = 0;
		String shortfp = "";
		int shortfpnum = Integer.MAX_VALUE;
		String maxprofnom ="";
		int perm;
		int minperm = Integer.MAX_VALUE;
		String departamento = "";
		String ultimaespecialidad="";
		String penultimaespecialidad="";
		Scanner sc = new Scanner(System.in);
		String code = sc.next();
		while (!code.equals("fin")){
			type = code.charAt(0);
		
			if (type == 'D') {
				System.out.println("Inserte el nombre del departamento");
				departamento = sc.next();
				System.out.println("Número de profesores en el departamento");
				profdpto = sc.nextInt();
				if (maxprof < profdpto) {
					maxprof = profdpto;
					maxprofnom = departamento;
				}
				for (int i = 1; i <= profdpto; i++) {
					sumperm = 0;
					System.out.println("Inserte el nombre del profesor en la posición "+i);
					nom = sc.next();
					System.out.println("Ahora inserte los años de permanencia en el contrato de "+nom);
					perm = sc.nextInt();
					sumperm = sumperm + perm;
				}
				if (minperm > sumperm / profdpto) {
					minperm = sumperm /  profdpto;
				}
				System.out.println("El departamento con más profesores es "+maxprofnom+ " y el que menos duración media de contrato tiene es "+minperm);
			}
			else if (type == 'C') {
				System.out.println("Introduzca el tipo de curso");
				type = sc.next().charAt(0);
				switch(type) {
				case 'E':
					contalum = 0;
					System.out.println("Inserte el nombre de la clase");
					clase = sc.next();
					System.out.println("Inserte el nombre del alumno");
					alumno = sc.next();
					while (!alumno.equals("fin")) {
						contalum = contalum++;
						System.out.println("Inserte su media");
						media = sc.nextFloat();
						mediaclase = mediaclase + media;
					}
					if (contalum < 20) {
						mediaclase = mediaclase / contalum;
						clasemasmedia = clase;
					}
				case 'P':
					System.out.println("Introduzca el nombre de la especialidad");
					penultimaespecialidad = ultimaespecialidad;
					ultimaespecialidad = sc.next();
				case 'F':
					System.out.println("Introduzca la duración en horas");
					dur = sc.nextInt();
					if (dur < shortfpnum) {
						System.out.println("Introduzca el nombre de este fp para guardarlo, pues es el más corto de momento");
						shortfp = sc.next();
					}
					if (dur > 1500) {
						contmil++;
					}
				case 'B':
					contbach++;
					System.out.println("Inserte el número de asignaturas");
					subject = sc.nextFloat();
					sumsubject = sumsubject + subject;
				}
					
			}
			
		}
		sc.close();
		System.out.println("La clase de la ESO con más nota media y menos de 20 alumnos es "+clasemasmedia);
		if (!penultimaespecialidad.equals("")) {
			System.out.println("Hay menos de 2 especialidades");
		}
		System.out.println("Las últimas especialidades son: "+ultimaespecialidad+ ", "+penultimaespecialidad);
		System.out.println("FP con menor duración: "+shortfp);
		System.out.println("Número de FP con duración de más de 1500 horas: "+contmil);
		System.out.println("Media de asignaturas de bachillerato: "+sumsubject/contbach);
	}

}
