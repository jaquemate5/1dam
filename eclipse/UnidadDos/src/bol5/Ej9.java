package bol5;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divisoresprimos(30);
	}
	public static void divisoresprimos(int num) {
		int numero;
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				if(primo(i)) {
					numero = i;
					System.out.println(numero);
				}
			}
		}
	}
	
	public static boolean primo(int num) {
		boolean es = true;
		for (int i = 2; i <= Math.sqrt(num)+1; i++) {
			if (num%i == 0) {
				es = false;
			}
		}
		return es;
	}
}
