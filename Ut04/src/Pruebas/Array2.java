package Pruebas;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int array[]=new int [5];
		for(int i=0; i<array.length; i++) {
			System.out.println("Introduce un numero para el hueco "+i+" del array");
			array[i]=sc.nextInt();
		}
		for(int i=0; i<array.length; i++) {
			System.out.println("Para el hueco "+i+" del array, el valor es "+array[i]);
		}
		sc.close();
	}

}
