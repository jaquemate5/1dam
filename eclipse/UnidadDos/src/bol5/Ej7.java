package bol5;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (primo(5) == false) {
			System.out.println("No es primo");
		}
		else {
			System.out.println("Primo");
		}
	}
	static boolean primo(int num) {
		boolean es = true;
		for (int i = 2; i <= Math.sqrt(num)+1; i++) {
			if (num%i == 0) {
				es = false;
			}
		}
		return es;
	}
}
