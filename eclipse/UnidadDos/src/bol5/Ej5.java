package bol5;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El mayor es: "+masmayor(3,9,10));
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
	static int masmayor(int num1, int num2, int num3) {
		int greater = mayor(mayor(num1, num2),num3);
		return greater;
	}
}