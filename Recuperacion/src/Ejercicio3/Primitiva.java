package Ejercicio3;

import java.util.*;

public class Primitiva {
	
	private static final int maxValor=49, minValor=1;
	@SuppressWarnings("unused")
	private static String dia;//dia del sorteo (jueves o sábado)
	@SuppressWarnings("unused")
	private static double recaudacion;//recaudacion de la jornada
	private static int[] numeros=new int[7];//números premiados
	private static int[] acertantes=new int[5];//acertantes de cada una de las categorías 3,4,5,5+complementario y 6 aciertos
	
	public static boolean compruebaNumeros(int[] arr) {
		boolean ret=false;
		if(arr.length==7) {
			ret=true;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]<minValor||arr[i]>maxValor) {
					ret=false;
				}
			}
		}
		return ret;
	}
	
	public static void ponerResultados() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la recaudacion");
		recaudacion=sc.nextDouble();
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Introduce el numero "+(i+1));
			numeros[i]=sc.nextInt();
		}
		for(int i=0; i<acertantes.length; i++) {
			System.out.println("Introduce el acertante "+(i+1));
			acertantes[i]=sc.nextInt();
		}
		sc.close();
		if(!compruebaNumeros(numeros)) {
			for(int i=0; i<numeros.length; i++) {
				numeros[i]=0;
			}
			System.out.println("La combinacion no es correcta");
		}
	}
	
	public static void variarTodo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el dia");
		dia=sc.nextLine();
		ponerResultados();
		sc.close();
	}
}
