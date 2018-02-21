package Pruebas;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo
		//También muestra los alumnos con notas superiores a la media
		//El número de alumnos se lee por teclado.
		Scanner sc=new Scanner(System.in);
		double notaTotal=0, notaMedia;
		int  numAlumnos;
		System.out.println("Introduce el numero de alumnos");
		numAlumnos=sc.nextInt();
		double arrayAlumnos[]=new double[numAlumnos];
		for(int i=0; i<numAlumnos; i++) {
			System.out.println("Introduce la nota del alumno "+(i+1));
			arrayAlumnos[i]=sc.nextInt();
		}
		for(int i=0; i<numAlumnos; i++) {
			notaTotal=notaTotal+arrayAlumnos[i];
		}
		notaMedia=notaTotal/numAlumnos;
		System.out.println("La nota media del grupo es: "+notaMedia);
		for(int i=0; i<numAlumnos; i++) {
			if(arrayAlumnos[i]>notaMedia) {
				System.out.println("El alumno "+(int)(i+1)+" esta por encima de la media");
			}
		}
		sc.close();
	}

}
