package Pruebas;

public class ArrayB {

	public static void main(String[] args) {
		int arrayb[][]= {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16},
				{17, 18, 19, 20}
						};
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arrayb[i][j]+" ");
			}
			System.out.println();
		}
		/*for(int j=0; j<4; j++) {
			for(int i=0; i<5; i++) {
				System.out.print(arrayb[i][j]+" ");
			}
			System.out.println();
		}*/
	}

}