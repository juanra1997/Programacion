package Pruebas;
import java.util.*;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa Java que guarda en un array 10 números enteros que se leen por teclado. 
		//A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros, mostrando el arrayy los resultados en pantalla
		Scanner sc=new Scanner(System.in);
		int array[]=new int[10], numPositivos=0, numNegativos=0, ceros=0;
		for(int i=0; i<10; i++) {
			System.out.println("Introduce un numero");
			array[i]=sc.nextInt();
			if(array[i]<0) {
				numNegativos++;
			}
			if(array[i]==0) {
				ceros++;
			}
			if(array[i]>0) {
				numPositivos++;
			}
		}
		System.out.println("El array");
		for(int i=0; i<10; i++) {
			System.out.println(array[i]);
		}
		System.out.print("En el array hay:\n"+numNegativos+" numeros negativos\n"+ceros+" ceros\n"+numPositivos+" numeros positivos");
		sc.close();
	}

}
