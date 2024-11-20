package bol5;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vamos a comprobar si la letra es una vocal");
		System.out.println(vocal('h'));
	}
	static boolean vocal(char caracter) {
		boolean bool = false;
		switch(caracter) {
		case 'a':
			bool = true;
		case 'e':
			bool = true;
		case 'i':
			bool = true;
		case 'o':
			bool = true;
		case 'u':
			bool = true;
			break;
		}
		return bool;
	}
}
