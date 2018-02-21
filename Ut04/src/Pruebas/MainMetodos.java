package Pruebas;

public class MainMetodos {

	public static void main(String[] args) {
		int array[][]=new int[2][3];
		int array1[][]=new int[3][2];
		int array2[][]= {{1,2,3},{4,5,6}};
		ArrayBiMetodos.LeerValoresMatriz(array);
		ArrayBiMetodos.LeerValoresMatriz(array1);
		ArrayBiMetodos.ImprimirMatrices(array);
		ArrayBiMetodos.ImprimirMatrices(array1);
		System.out.println("El valor maximo del array seleccionado es: "+ArrayBiMetodos.ValorMaximo(array));
		ArrayBiMetodos.ImprimirMatrices(ArrayBiMetodos.MultiplicarMatrices(array, array1));
		ArrayBiMetodos.ImprimirMatrices(ArrayBiMetodos.MatrizTranspuesta(array2));
	}

}
