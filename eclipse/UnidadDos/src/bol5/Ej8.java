package bol5;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divisoresprimos(30));
	}
	public static int divisoresprimos(int num) {
		int cont = 0;
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				if(primo(i)) {
					cont = cont+1;
				}
			}
		}
		return cont;
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
