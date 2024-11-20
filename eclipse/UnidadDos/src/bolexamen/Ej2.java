package bolexamen;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumnos=0;
		int menos8 = 0;
		int aprobados5num = 0;
		String aprobados5="";
		float nota=0f;
		int suspenso=0;
		float mayormedianum = 0f;
		float menormedianum = 10f;
		String mayormedia="";
		String menormedia="";
		float mediacurso;
		int menossuspensos = 0;
		int massuspensosnum = 0;
		String massuspensos = "";
		String massuspensos2 = "";
		int massuspensos2num = 0;
		float sumacurso=0f;
		float ultima=0f;
		float penultima=0f;
		System.out.println("Introduzca el nombre del curso");
		String nombrecurso=sc.next();
		while (!nombrecurso.equals("fin")) {
			sumacurso = 0;
			suspenso = 0;
			System.out.println("¿número de alumnos?");
			alumnos = sc.nextInt();
			if (alumnos < 8) {
				menos8 = menos8 + 1;
			}
			for (int i = 0; i < alumnos; i++) {
				System.out.println("Dame la nota de cada alumno - "+i);
				nota = sc.nextFloat();
				sumacurso = sumacurso + nota;
				if (nota < 5) {
					suspenso = suspenso + 1;
				}
				penultima = ultima;
				ultima = nota;
				}
			if (alumnos > 5 && alumnos-suspenso > menossuspensos) {
				aprobados5num = alumnos-suspenso;
				System.out.println("Por ahora, este curso tiene el mayor número de aprobados (entre las clases con más de 5 alumnos");
				aprobados5 = nombrecurso;
			}
			mediacurso = sumacurso / alumnos;
			System.out.println("La media es de "+mediacurso);
			if (mediacurso > mayormedianum) {
				mayormedia = nombrecurso;
			}
			if (mediacurso < menormedianum) {
				menormedia = nombrecurso;
			}
			if (massuspensosnum < suspenso) {
				if (massuspensosnum <= massuspensos2num) {
					massuspensosnum = suspenso;
					massuspensos = nombrecurso;
				}
			}
			if (massuspensos2num < suspenso && massuspensosnum != suspenso) {
				massuspensos2num = suspenso;
				massuspensos2 = nombrecurso;
				}
			System.out.println("Nombre del siguiente curso");
			nombrecurso=sc.next();
			}

			System.out.println("Las dos últimas notas son "+penultima+" y "+ultima);
			System.out.println("Las dos clases con más suspensos son "+massuspensos+" y "+massuspensos2);
			System.out.println("El curso con la mayor media es "+mayormedia);
			System.out.println("El curso con la menor media es "+menormedia);
			System.out.println("El curso de más de 5 alumnos con más aprobados es "+aprobados5+" con "+aprobados5num+" aprobados");
			sc.close();
		}
	
	}

