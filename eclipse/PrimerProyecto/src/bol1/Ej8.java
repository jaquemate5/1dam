package bol1;

public class Ej8 {

	public static void main(String[] args) {
		int segundos = 280;
		int minutos = 119;
		int horas = 10;
		minutos = minutos + (segundos / 60);
		segundos = segundos % 60;
		horas = horas + (minutos / 60);
		minutos = minutos % 60;
		System.out.println(horas+":"+minutos+":"+segundos);
	}

}
