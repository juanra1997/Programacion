package Pruebas;
import java.util.*;
public class Ejerciciorarodeclaseparte2 {

	public static void main(String[] args) {
		//Crea un array de capacidad 15 e introduce valores entero aleatorios en el (entre 1 y 10) y muestralo
		ArrayList<Integer> array=new ArrayList<Integer>(15);
		for(int i=0; i<15; i++) {
			array.add((int)(Math.random()*10+1));
		}
		System.out.print("El array: ");
		for(int i=0; i<array.size(); i++) {
			System.out.print(array.get(i)+" ");
		}
		//Para probar un metodo relacionado con el tamaño de la lista, muestra el numero de elementos que contiene la lista
		System.out.println("\nNumero de elementos que contiene la lista: "+array.size());
		//Para probar un metodo para añadir elementos, añade un numero aleatorio y muestralo
		array.add((int)(Math.random()*10+1));
		System.out.print("El array aumentado: ");
		for(int i=0; i<array.size(); i++) {
			System.out.print(array.get(i)+" ");
		}
		//Para probar un metodo relacionado con recuperar elementos y posiciones, muestra el elemento que se encuentra en la posicion 5
		System.out.println("\nEn la posicion 5, se encuentra el elemento: "+array.get(5));
		//Para probar un metodo relacionado con eliminar elementos, elimina el ultimo elemento añadido y muestralo
		array.remove(15);
		System.out.print("El array con el ultimo elemento añadido eliminado: ");
		for(int i=0; i<array.size(); i++) {
			System.out.print(array.get(i)+" ");
		}
	}

}
