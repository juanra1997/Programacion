package Ejercicios;
//import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Introduce la cadena en la que cotar vocales y consonantes");
		String cadena1="cadena1", cadena2="cadena2";
		System.out.println(cadena1.compareTo(cadena2));
		/*if(cadena2.compareTo(cadena1)>0) {
			String aux=cadena1;
			cadena1=cadena2;
			cadena2=aux;
		}*/
		OrdenacionYBusqueda.Ordenar(cadena1, cadena2);
		System.out.println(cadena1);
		//OrdenacionYBusqueda.Ordenar(cadena1, cadena2);
		System.out.println(cadena2);
	}

}
