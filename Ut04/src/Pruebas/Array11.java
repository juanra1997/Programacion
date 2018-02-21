package Pruebas;

import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num, buscar;
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
			System.out.print(array[i]+" ");
		}
		System.out.println("\nIntroduce el numero a buscar");
		buscar=sc.nextInt();
		for(int i=0; i<num; i++) {
			if(array[i]==buscar) {
				System.out.println("Se he encontrado el numero en la posicion "+i);
				encontrado=true;
			}
		}
		if(encontrado==false) {
			System.out.println("El numero no se encuentra en el array");
		}
		sc.close();
	}

}
