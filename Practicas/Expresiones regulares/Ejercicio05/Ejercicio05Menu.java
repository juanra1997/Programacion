package Ejercicio05;

import java.util.Scanner;

public class Ejercicio05Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lectura;
		String num;
		System.out.println("Introduzca el numero de la operacion a realizar.\n1. Convertir de binario a decimal.\n2. Convertir de octal a decimal.\n3. Convertir de hexadecimal a decimal\nLos demas numeros hacen que el programa termine");
		lectura=sc.nextInt();
		while(lectura<=3&&lectura>=1) {
			System.out.println("Introduzca el numero a convertir");
			num=sc.next();
			switch(lectura) {
				case 1: 
					System.out.println("********************************************************************");
					System.out.println(MetodosDeCambio.deBinarioADecimal(num));
					System.out.println("********************************************************************");
					break;
				case 2: 
					System.out.println("********************************************************************");
					System.out.println(MetodosDeCambio.deOctalADecimal(num));
					System.out.println("********************************************************************");
					break;
				case 3: 
					System.out.println("********************************************************************");
					System.out.println(MetodosDeCambio.deHexadecimalADecimal(num));
					System.out.println("********************************************************************");
					break;
				}
			System.out.println("Introduzca el numero de la operacion a realizar.\n1. Convertir de binario a decimal.\n2. Convertir de octal a decimal.\n3. Convertir de hexadecimal a decimal\nLos demas numeros hacen que el programa termine");
			lectura=sc.nextInt();
		}
		sc.close();
	}

}
