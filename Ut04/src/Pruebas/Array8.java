package Pruebas;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double array[]=new double[10], positivos=0, negativos=0, contpos=0, contneg=0, ceros=0;
		for(int i=0; i<10; i++) {
			System.out.println("Introduce un numero");
			array[i]=sc.nextDouble();
			if(array[i]<0) {
				negativos=negativos+array[i];
				contneg++;
			}
			if(array[i]>0) {
				positivos=positivos+array[i];
				contpos++;
			}
			if(array[i]==0) {
				ceros++;
			}
		}
		System.out.println("La media de los numeros positivos es: "+positivos/contpos+"\nLa media de los numeros negativos es: "+negativos/contneg+"\nHay "+(int)ceros+" ceros");
		sc.close();
	}

}
