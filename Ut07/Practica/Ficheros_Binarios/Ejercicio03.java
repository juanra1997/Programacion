package Ficheros_Binarios;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Ejercicio03 {
	
	static File f=new File("Alumnos.bin");

	public static void main(String[] args) {

		Ejercicio03 obj=new Ejercicio03();
		obj.menu();
	}

	public void menu() {
		Scanner sc=new Scanner(System.in);
		int op=0, cont=0, x=0;
		double nota=0;
		while(x==0) {
		System.out.println("Menú\n1. Mostrar la media del curso\n2. Mostrar el nombre de los alumnos con mejor nota\n3. Mostrar el nombre de los alumnos con peor nota\n4. Salir del programa");
		op=sc.nextInt();
		switch(op) {
			case 1:
				try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
					
					Alumno leido=new Alumno();
					leido=(Alumno) fs.readObject();
					do {						
						nota=nota+leido.getNota();
						cont++;
						leido= (Alumno) fs.readObject();
					}while(true);
				} catch (EOFException eof){
					/*System.out.println("***********************************");
					System.out.println("Fin lectura.");
					System.out.println("***********************************");*/
				} catch (ClassNotFoundException e) {
					System.out.println("ERROR: Problema al leer objeto");
				} catch (FileNotFoundException e1) {
					System.out.println("ERROR: Archivo no encontrado");
				} catch (IOException e1) {
					System.out.println("ERROR: Problema en la lectura");
					//e1.printStackTrace();
				}
				System.out.println("******************************\n"+nota/cont+"\n******************************");
				break;
			case 2:
				double maxn=0;
				try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
					
					Alumno leido=new Alumno();
					leido=(Alumno) fs.readObject();
					do {						
						if(leido.getNota()>maxn) {
							maxn=leido.getNota();
						}
						//cont++;
						leido= (Alumno) fs.readObject();
					}while(true);
				} catch (EOFException eof){
					/*System.out.println("***********************************");
					System.out.println("Fin lectura.");
					System.out.println("***********************************");*/
				} catch (ClassNotFoundException e) {
					System.out.println("ERROR: Problema al leer objeto");
				} catch (FileNotFoundException e1) {
					System.out.println("ERROR: Archivo no encontrado");
				} catch (IOException e1) {
					System.out.println("ERROR: Problema en la lectura");
					//e1.printStackTrace();
				}
				//System.out.println(maxn);
				try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
					
					Alumno leido=new Alumno();
					leido=(Alumno) fs.readObject();
					do {		
						if(leido.getNota()==maxn) {
							System.out.println("***********************************");
							System.out.println(leido.toString());
						}
						leido= (Alumno) fs.readObject();
					}while(true);
				} catch (EOFException eof){
					System.out.println("***********************************");
					System.out.println("Fin lectura.");
					System.out.println("***********************************");
				} catch (ClassNotFoundException e) {
					System.out.println("ERROR: Problema al leer objeto");
				} catch (FileNotFoundException e1) {
					System.out.println("ERROR: Archivo no encontrado");
				} catch (IOException e1) {
					System.out.println("ERROR: Problema en la lectura");
					//e1.printStackTrace();
				}
				break;
			case 3:
				double minn=100;
				try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
					
					Alumno leido=new Alumno();
					leido=(Alumno) fs.readObject();
					do {						
						if(leido.getNota()<minn) {
							minn=leido.getNota();
						}
						//cont++;
						leido= (Alumno) fs.readObject();
					}while(true);
				} catch (EOFException eof){
					/*System.out.println("***********************************");
					System.out.println("Fin lectura.");
					System.out.println("***********************************");*/
				} catch (ClassNotFoundException e) {
					System.out.println("ERROR: Problema al leer objeto");
				} catch (FileNotFoundException e1) {
					System.out.println("ERROR: Archivo no encontrado");
				} catch (IOException e1) {
					System.out.println("ERROR: Problema en la lectura");
					//e1.printStackTrace();
				}
				//System.out.println(maxn);
				try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
					
					Alumno leido=new Alumno();
					leido=(Alumno) fs.readObject();
					do {		
						if(leido.getNota()==minn) {
							System.out.println("***********************************");
							System.out.println(leido.toString());
						}
						leido= (Alumno) fs.readObject();
					}while(true);
				} catch (EOFException eof){
					System.out.println("***********************************");
					System.out.println("Fin lectura.");
					System.out.println("***********************************");
				} catch (ClassNotFoundException e) {
					System.out.println("ERROR: Problema al leer objeto");
				} catch (FileNotFoundException e1) {
					System.out.println("ERROR: Archivo no encontrado");
				} catch (IOException e1) {
					System.out.println("ERROR: Problema en la lectura");
					//e1.printStackTrace();
				}
				break;
			case 4:
				x=1;
				break;
			default:
				System.out.println("*********************\nNo es una opcion\n*********************");
		}
	}
		sc.close();
	}
}
