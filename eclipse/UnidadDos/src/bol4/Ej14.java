package bol4;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte el lado mayor");
		int l = sc.nextInt();
		sc.close();
		int n = l;
		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			n = n - 1;
			System.out.println("");
		}
	}

}
