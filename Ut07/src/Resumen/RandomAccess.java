package Resumen;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomAccess {
	private static int numObjetos=0;
	
	public static void main(String arg[]) {
		Scanner teclado = new Scanner(System.in);
		File archivo=new File("C:\\prueba\\RandomAccess.txt");
		if (archivo.exists()){
			archivo.delete();
		}
		
		int menu=0;
		do {
			boolean salir=false;
			do {
				try {
				System.out.println("\n-- OBJETOS MENU --");
				System.out.println("1. A�adir Objeto\n2.Ver Objetos\n3. Salir\n-> Seleccione una opci�n");
				menu=teclado.nextInt();
				salir=true;
				}catch (InputMismatchException e) {
					teclado.nextLine();//Limpiar buffer
					System.out.println("ERROR: Introduce un valor num�rico.");
				}
			}while (salir==false);
			
			switch (menu) {
				//A�ADIR OBJETOS AL FICHERO
				case 1:
					teclado.nextLine();//Limpiar buffer
					System.out.println("Introduce un nombre de objeto:");
					String nombre=teclado.nextLine();
					System.out.println("Introduce una descripci�n del objeto:");
					String descrip=teclado.nextLine();
					
					//LIMITAR TAMA�O DE LOS ATRIBUTOS
					nombre=nombre.substring(0, Math.min(10, nombre.length()));
					descrip=descrip.substring(0, Math.min(30, descrip.length()));

					//CREACION DEL OBJETO A INSERTAR
					Objeto2 add = new Objeto2(nombre,descrip);
					
					//ESCRITURA DE OBJETO MOVIENDO EL CURSOR
					try(RandomAccessFile flujo = new RandomAccessFile(archivo,"rw")) {
						//Colocoar puntero en el lugar indicado para escribir
						flujo.seek(numObjetos*Objeto2.getTamano());
						flujo.writeUTF(add.getNombre());
						flujo.writeUTF(add.getUtilidad());
						numObjetos++;
					} catch (FileNotFoundException e) {
						System.out.println("Error: Fichero no encontrado");
					} catch (IOException e1) {
						System.out.println("Error de lectura/escritura");
					}
					break;
				
				//VISUALIZAR OBJETOS DEL FICHERO
				case 2:
					try(RandomAccessFile flujo = new RandomAccessFile(archivo,"rw")) {
						for (int i=0;true;i++) {
							flujo.seek(i*Objeto2.getTamano());
							String nombreL=flujo.readUTF();
							String descripL =flujo.readUTF();
							Objeto2 leido = new Objeto2(nombreL, descripL); 
							System.out.println(leido.toString());
						}
					}catch (EOFException eof) {
						
					} catch (FileNotFoundException e) {
						System.out.println("Error: Fichero no encontrado");
					} catch (IOException e1) {
						System.out.println("Error de lectura/escritura");
					}
					break;
					
				//SALIR DEL PROGRAMA
				case 3: 
					System.out.println("Hasta pronto!");
					teclado.close();
					break;
			}
			
		}while (menu!=3);
	}
}
