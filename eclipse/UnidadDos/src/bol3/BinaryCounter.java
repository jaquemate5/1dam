package bol3;

public class BinaryCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n0 = 0;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;
		int n7 = 0;
		//BYTE COUNT
		for (n0 = 0; n0 <= 1; n0++) {
			for (n1 = 0; n1 <= 1; n1++) {
				for (n2 = 0; n2 <= 1; n2++) {
					for (n3 = 0; n3 <= 1; n3++) {
						for (n4 = 0; n4 <= 1; n4++) {
							for (n5 = 0; n5 <= 1; n5++) {
								for (n6 = 0; n6 <= 1; n6++) {
									for (n7 = 0; n7 <= 1; n7++) {
										System.out.println(n0+""+n1+""+n2+""+n3+""+n4+""+n5+""+n6+""+n7);
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
