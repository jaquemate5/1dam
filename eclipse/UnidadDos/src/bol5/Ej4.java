package bol5;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El mayor es: "+mayor(1,3));
	}
	static int mayor(int num1, int num2) {
		int greater;
		if (num1 > num2) {
			greater = num1;
		}
		else {
			greater = num2;
		}
		return greater;
	}
}
