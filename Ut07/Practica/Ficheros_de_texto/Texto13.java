package Ficheros_de_texto;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Texto13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica la ruta de los archivos");
		String ruta = sc.next();
		File ciudades = new File(ruta + "/" + "Ciudades.txt");
		File paises = new File(ruta + "/" + "Paises.txt");
		
		try {
			ciudades.createNewFile();
			paises.createNewFile();
		
		} catch (IOException e1) {
			System.out.println("Ese archivo ya existe");
		} catch (Exception e) {
			System.out.println("Error al introducir datos");
		}
		
		try {
			PrintWriter pw = new PrintWriter(ciudades);
			PrintWriter pw2 = new PrintWriter(paises);
			
			System.out.println("¿Cuantas ciudades quieres introducir?");
			int cantidad = sc.nextInt();
			String[] arr = new String[cantidad];
			for(int i = 0; i < cantidad; i++) {
				System.out.println("Escribe el nombre de la ciudad " + (i+1));
				String ciudad = sc.next();
				arr[i] = ciudad;
				pw.println(ciudad);
			}
			System.out.println("¿Cuantos paises quieres introducir?");
			int cantidad2 = sc.nextInt();
			String[] arr2 = new String[cantidad2];
			for(int i = 0; i < cantidad2; i++) {
				System.out.println("Escribe el nombre del pais " + (i+1));
				String pais = sc.next();
				arr2[i] = pais;
				pw2.println(pais);
			}
			
			int eleccion;
			System.out.println("Indica en que orden quieres fusionar los ficheros");
			do {
				System.out.println("1. Primero  ciudades  (el  fichero  se  llamará Ciudades_Paises.txt)");
				System.out.println("2. Primero  países  (el  fichero  se  llamará Paises_Ciudades.txt)");
				System.out.println("3. Salir  del  programa");
				eleccion = sc.nextInt();
				switch(eleccion) {
					case 1: {
						File fusion = new File(ruta + "/" + "Ciudades_Paises.txt");
						fusion.createNewFile();
						PrintWriter pw3 = new PrintWriter(fusion);
						
						pw3.println("Ciudades:");
						for(int i = 0; i<arr.length; i++) {
							pw3.println(arr[i]);
						}
						pw3.println("********************");
						pw3.println("Paises:");
						for(int i = 0; i<arr2.length; i++) {
							pw3.println(arr2[i]);
						}
						pw3.close();
					}
					break;
					case 2: {
						File fusion2 = new File(ruta + "/" + "Paises_Ciudades.txt");
						fusion2.createNewFile();
						PrintWriter pw3 = new PrintWriter(fusion2);
						
						
						pw3.println("Paises:");
						for(int i = 0; i<arr2.length; i++) {
							pw3.println(arr2[i]);
						}
						pw3.println("********************");
						pw3.println("Ciudades:");
						for(int i = 0; i<arr.length; i++) {
							pw3.println(arr[i]);
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
			pw.close();
		} catch (Exception e) {
			System.out.println("Error al introducir datos");
		}
		sc.close();
	}
}

