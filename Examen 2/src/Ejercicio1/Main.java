package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		int[] array1={7,5,3,1}, array2= {4,6,2,8};
		for(int i=0; i<Metodos.UnirArrays(array1, array2).length; i++) {
			System.out.println(Metodos.UnirArrays(array1, array2)[i]);
		}
	}

}
