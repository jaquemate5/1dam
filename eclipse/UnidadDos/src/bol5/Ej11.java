package bol5;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(exponencialrecursivo(2,3));
	}
	public static int exponencialrecursivo(int num1, int num2) {
		int resp;
		int current = 1;
		if (num2 == 0) {
			resp = current;
		}
		else {
			current = num1*exponencialrecursivo(num1, num2-1);
		}
		resp = current;
		return resp;
	}
	
	public static int exponenteiterativo(int num1, int num2) {
		int current = num1;
		for (int i = 1; i <= num1; i++) {
			current = current * num1;
		}
		return current;
	}
}
