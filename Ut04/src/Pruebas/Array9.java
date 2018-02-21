package Pruebas;
import java.util.*;
public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hacer un programa para ingresar n valores reales en un arreglo y los muestreen la pantalla, además informará del mayor, el menor y el promedio.
		Scanner sc=new Scanner(System.in);
		int cantidad;
		double mayor=0, menor=0, suma=0;
		System.out.println("Introduce la cantidad de numeros a ingresar");
		cantidad=sc.nextInt();
		double array[]=new double[cantidad];
		for(int i=0; i<cantidad; i++) {
			System.out.println("Introduce un numero");
			array[i]=sc.nextDouble();
			suma=suma+array[i];
			if(i==0) {
				mayor=array[i];
				menor=array[i];
			}
			if(array[i]>mayor) {
				mayor=array[i];
			}
			if(array[i]<menor) {
				menor=array[i];
			}
		}
		System.out.println("El numero mas grande introducido es: "+mayor+"\nEl numero mas pequeño introducido es: "+menor+"\nLa media de los numeros introducidos es: "+suma/cantidad);
		sc.close();
	}

}
