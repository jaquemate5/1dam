package tablas2;

import java.util.Arrays;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t[][] = new int [5][5];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j<t[i].length; j++) {
				t[i][j] = i + j;
			}
		}
		for (int i = 0; i < t.length; i++) {
			System.out.println(Arrays.toString(t[i]));
		}
	}

}
