package Pruebas;
import java.util.Scanner;
public class ArrayBiMetodos {

//private int filas;
//private int columnas;

	/*public static void LeerValoresMatriz(int filas, int columnas) {
		Scanner sc=new Scanner(System.in);
		int matriz[][]=new int[filas][columnas];
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				System.out.println("Introduce un valor");
				matriz[i][j]=sc.nextInt();
			}
		}
		sc.close();
	}*/
	
	public static void LeerValoresMatriz(int[][] array) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		//int matriz[][]=new int[filas][columnas];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.println("Introduce un valor para la fila "+i+" columna "+j);
				array[i][j]=sc.nextInt();
			}
		}
		//sc.close();
	}
	
	public static void ImprimirMatrices(int[][] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print("Fila "+i+": ");
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	 public static int ValorMaximo(int[][] array) {
		 int mayor=0;
		 for(int i=0; i<array.length; i++) {
			 for(int j=0; j<array[i].length; j++) {
				 if(i==0&&j==0) {
					 mayor=array[i][j];
				 }
				 if(array[i][j]>mayor) {
					 mayor=array[i][j];
				 }
			 }
		 }
		 return mayor;
	 }
	 
	 public static int ValorMinimo(int[][] array) {
		 int menor=0;
		 for(int i=0; i<array.length; i++) {
			 for(int j=0; j<array[i].length; j++) {
				 if(i==0&&j==0) {
					 menor=array[i][j];
				 }
				 if(array[i][j]<menor) {
					 menor=array[i][j];
				 }
			 }
		 }
		 return menor;
	 }
	 
	 public static int[][] SumaMatrices(int[][] array1, int[][]array2){
		 if(array1.length==array1.length&&array1[0].length==array2[0].length) {
			 int resultado[][]=array1;
			 for(int i=0; i<resultado.length; i++) {
				 for(int j=0; j<resultado[i].length; j++) {
					 resultado[i][j]=array1[i][j]+array2[i][j];
				 }
			 }
			 return resultado;
		 }else {
			 int resultado[][]= {{0}};
			 return resultado;
		 }
	 }
	 
	 public static int[][] RestaMatrices(int[][] array1, int[][]array2){
		 if(array1.length==array1.length&&array1[0].length==array2[0].length) {
			 int resultado[][]=array1;
			 for(int i=0; i<resultado.length; i++) {
				 for(int j=0; j<resultado[i].length; j++) {
					 resultado[i][j]=array1[i][j]-array2[i][j];
				 }
			 }
			 return resultado;
		 }else {
			 int resultado[][]= {{0}};
			 return resultado;
		 }
	 }
	 
	 public static int[][] MultiplicarMatricesPorEscalar(int[][] array, int escalar){
		 int resultado[][]=array;
		 for(int i=0; i<array.length; i++) {
			 for(int j=0; i<array[i].length; j++) {
				 resultado[i][j]=array[i][j]*escalar;
			 }
		 }
		 return resultado;
	 }
	 
	 public static int[][] MultiplicarMatrices(int[][] array1, int[][]array2){
		 if(array1[0].length==array2.length) {
			 int resultado[][]=new int[array1.length][array2[0].length];
			 //int suma=0;
			 //boolean multiplicado=false/*, multiplicado0=false*/;
			 for(int i=0; i<resultado.length; i++) {
				 for(int j=0; j<resultado[i].length; j++) {
					 for(int x=0; x<array1.length/*&&multiplicado0==false*/; x++) {
						 resultado[i][j]=resultado[i][j]+array1[i][x]*array2[x][j];
						 //multiplicado=false;
						 //multiplicado0=true;
						 /*for(int z=0; z<array1[x].length&&multiplicado==false; z++) {
							suma=suma+array1[z][x]*array2[x][z];
							multiplicado=true;
						 }*/
					 }
					 //resultado[i][j]=suma;
					 //suma=0;
					 //multiplicado0=false;
				 }
			 }
			 return resultado;
		 }else {
			 int[][] resultado={{0}};
			 return resultado;
		 }
	 }

	 public static int[][] MatrizTranspuesta(int[][] array){
		 int[][] resultado=new int[array[0].length][array.length];
		 for(int i=0; i<array.length; i++) {
			 for(int j=0; j<array[i].length; j++) {
				 resultado[j][i]=array[i][j];
			 }
		 }
		 return resultado;
	 }
}
