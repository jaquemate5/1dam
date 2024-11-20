package bol5;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	public static int factorial(int num) {
		int resp;
		if (num==0) {
			resp = 1;
		}
		else {
			resp = num * factorial(num-1);
		}
		return resp;
	}
}
