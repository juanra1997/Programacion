package Ficheros_de_texto;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Texto14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica la ruta de los archivos individuales");
		String ruta1 = sc.next();
		System.out.println("indica el nombre del primer fichero");
		String nombre1 = sc.next();
		System.out.println("indica el nombre del segundo fichero");
		String nombre2 = sc.next();
		File archivo1 = new File(ruta1 + "/" + nombre1);
		File archivo2 = new File(ruta1 + "/" + nombre2);
		
		
		try {
			if(!archivo1.createNewFile()) {
				sc.close();
				throw new IOException();
			}
			if(!archivo2.createNewFile()) {
				sc.close();
				throw new IOException();
			}
		} catch (IOException e1) {
			System.out.println("Ese archivo ya existe");
		}
		
		try {
			PrintWriter pw1 = new PrintWriter(archivo1);
			PrintWriter pw2 = new PrintWriter(archivo2);
			
			System.out.println("¿Cuantas lineas quieres introducir? (fichero 1)");
			int cantidad1 = sc.nextInt();
			String[] arr1 = new String[cantidad1];
			System.out.println("Escribe las filas(pasa a la siguiente con Enter)");
			for(int i = 0; i < cantidad1; i++) {
				String fila = sc.next();
				arr1[i] = fila;
				pw1.println(fila);
			}
			System.out.println("¿Cuantas lineas quieres introducir? (fichero 2)");
			int cantidad2 = sc.nextInt();
			String[] arr2 = new String[cantidad2];
			System.out.println("Escribe las filas(pasa a la siguiente con Enter)");
			for(int i = 0; i < cantidad2; i++) {
				String pais = sc.next();
				arr2[i] = pais;
				pw2.println(pais);
			}
			
			//Juntar elementos
			int eleccion;
			System.out.println("Indica en que orden quieres fusionar los ficheros");
			do {
				System.out.println("1. Primero  ciudades  (el  fichero  se  llamará Ciudades_Paises.txt)");
				System.out.println("2. Primero  países  (el  fichero  se  llamará Paises_Ciudades.txt)");
				System.out.println("3. Salir  del  programa");
				eleccion = sc.nextInt();
				switch(eleccion) {
					case 1: {
						System.out.println("introduce una ruta donde juntarlos");
						String ruta2 = sc.next();
						System.out.println("introduce un nombre");
						String nombre3 = sc.next();
						File fusion = new File(ruta2 + "/" + nombre3);
						fusion.createNewFile();
						PrintWriter pw3 = new PrintWriter(fusion);
						
						for(int i = 0; i<arr1.length; i++) {
							pw3.println(arr1[i]);
						}
						for(int i = 0; i<arr2.length; i++) {
							pw3.println(arr2[i]);
						}
						pw3.close();
					}
					break;
					case 2: {
						System.out.println("introduce una ruta donde juntarlos");
						String ruta2 = sc.next();
						System.out.println("introduce un nombre");
						String nombre3 = sc.next();
						File fusion = new File(ruta2 + "/" + nombre3);
						fusion.createNewFile();
						PrintWriter pw3 = new PrintWriter(fusion);
						
						for(int i = 0; i<arr2.length; i++) {
							pw3.println(arr2[i]);
						}
						
						for(int i = 0; i<arr1.length; i++) {
							pw3.println(arr1[i]);
						}
						pw3.close();
					}
					break;
					case 3: {
						eleccion = 4;
						System.out.println("Hasta luego");
					}
					break;
					default: {
						System.out.println("Respuesta no valida");
						eleccion = 1;
					}
				}
			} while (eleccion >= 1 && eleccion <= 3);
			
			pw2.close();
			pw1.close();
		} catch (Exception e) {
			System.out.println("Error al introducir datos");
		}
		sc.close();
	}
}
