package bol4;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mult = 1;
		int num = 1;
		for (int i=1; i < 10; i++) {
			mult = num * mult;
			num = num + 2;
		}
		System.out.println(mult);
	}

}
