package Pruebas;

import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("unused")
		int num, buscar;
		@SuppressWarnings("unused")
		boolean encontrado=false;
		System.out.println("¿Cuantos numeros vas a añadir al array?");
		num=sc.nextInt();
		int array[]=new int[num];
		for(int i=0; i<num; i++) {
			System.out.println("Introduce un numero");
			array[i]=sc.nextInt();
		}
		System.out.println("El array");
		for(int i=0; i<num; i++) {
			if(i!=(num-1)) {
			System.out.print(array[i]+",");
			} else {
				System.out.print(array[i]);
				}
		}
	sc.close();
	}

}
