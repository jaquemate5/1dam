package bol5;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(amigos(220, 284));
	}
	
	public static boolean amigos(int num1, int num2) {
		int sum1 = 0;
		int sum2 = 0;
		boolean amigo = false;
		for (int i = 1; i < num1; i++) {
			if (num1%i == 0) {
				sum1 = sum1 + i;
			}
		}
		if (sum1 == num2) {
			for (int i = 1; i < num2; i++) {
				if (num2%i == 0) {
					sum2 = sum2 + i;
				}
			}
			if (sum2 == num1) {
				amigo = true;
			}
		}
		return amigo;
	}
}
