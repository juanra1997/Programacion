package Ejercicios;

import java.io.*;
import java.util.*;

public class Ejercicio54 {

	public static void main(String[] args) {

		File f=new File("notas.dat");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("Algo ha ido mal");
				//e.printStackTrace();
			}
		}
		Scanner sc=new Scanner(System.in);
		String nom;
		int c=1,op;
		while(c==1) {
			System.out.println("Menu\n1. Introducir alumnos\n2. Borrar alumnos\n3. Borrar fichero y salir\n4. Calcular notas medias\n5. Listar alumnos\n6. Salir del programa");
			try {
				op=sc.nextInt();
			} catch(InputMismatchException ime){
				op=0;
			}
			switch(op) {
			case 1:
				
				double note1, note2, note3;
				System.out.println("¿Cuantos alumnos va a introducir?");
				try {
					op=sc.nextInt();
				} catch(InputMismatchException ime){
					op=0;
				}
				for(int i=0; i<op; i++) {
					sc=new Scanner(System.in);
					System.out.println("Introduce el nombre del alumno");
					nom=sc.nextLine();
					System.out.println("Introduce la nota del primer trimestre");
					note1=sc.nextDouble();
					System.out.println("Introduce la nota del segundo trimestre");
					note2=sc.nextDouble();
					System.out.println("Introduce la nota del tercer trimestre");
					note3=sc.nextDouble();
					if(f.length()==0) {
						try(ObjectOutputStream fs = new ObjectOutputStream(new FileOutputStream(f, true))){
							fs.writeObject(new Notas(nom, note1, note2, note3));
						} catch (FileNotFoundException e) {
							System.out.println("ERROR: Archivo no encontrado");
						} catch (IOException e) {
							System.out.println("ERROR: Problema en la escritura");
						}
					}else {
						try(MiObjectOutputStream fs = new MiObjectOutputStream(new FileOutputStream(f, true))){
							fs.writeObject(new Notas(nom, note1, note2, note3));
						} catch (FileNotFoundException e) {
							System.out.println("ERROR: Archivo no encontrado");
						} catch (IOException e) {
							System.out.println("ERROR: Problema en la escritura");
						}
					}
				}
				break;
			case 2:
				if(f.length()!=0) {
					File f2=new File("borrar.dat");
					if(!f2.exists()) {
						try {
							f2.createNewFile();
						} catch (IOException e) {
							System.out.println("Algo ha ido mal");
							//e.printStackTrace();
						}
					}
					System.out.println("¿Cuántos alumnos va a borrar?");
					try {
						op=sc.nextInt();
					} catch(InputMismatchException ime){
						op=0;
					}
					for(int i=0; i<op; i++) {
						sc=new Scanner(System.in);	
						System.out.println("Introduce el nombre del alumno "+(i+1));
						nom=sc.nextLine();
						try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
							
							Notas leido=new Notas();
							leido=(Notas) fs.readObject();
							do {
								System.out.println(leido.getNombre());
								System.out.println(!leido.getNombre().equals(nom));
								if(!leido.getNombre().equals(nom)) {
									if(f2.length()==0) {
										try(ObjectOutputStream fs2 = new ObjectOutputStream(new FileOutputStream(f2, true))){
											fs2.writeObject(leido);
										} catch (FileNotFoundException e) {
											System.out.println("ERROR: Archivo no encontrado");
										} catch (IOException e) {
											System.out.println("ERROR: Problema en la escritura");
										}
									}else {
										try(MiObjectOutputStream fs2 = new MiObjectOutputStream(new FileOutputStream(f2, true))){
											fs2.writeObject(leido);
										} catch (FileNotFoundException e) {
											System.out.println("ERROR: Archivo no encontrado");
										} catch (IOException e) {
											System.out.println("ERROR: Problema en la escritura");
										}
									}
								}
								//System.out.println(leido.toString());
								leido= (Notas) fs.readObject();
							}while(true);
						} catch (EOFException eof){
							//System.out.println("Fin lectura.");
						} catch (ClassNotFoundException e) {
							System.out.println("ERROR: Problema al leer objeto");
						} catch (FileNotFoundException e1) {
							System.out.println("ERROR: Archivo no encontrado");
						} catch (IOException e1) {
							System.out.println("ERROR: Problema en la lectura");
						}
					}
					//f2.renameTo(f);
				}else{
					System.out.println("No se han introducido alumnos");
				}
				break;
			case 3:
				f.delete();
				c=0;
				break;
			case 4:
				if(f.length()!=0) {
					int med=1;
					try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
						Notas leido=new Notas();
						leido=(Notas) fs.readObject();
						do {
							if(leido.getNota1()*0.2+leido.getNota2()*0.35+leido.getNota3()*0.45<=1) {
								med=1;
							}else if(leido.getNota1()*0.2+leido.getNota2()*0.35+leido.getNota3()*0.45<5&&leido.getNota1()*0.2+leido.getNota2()*0.35+leido.getNota3()*0.45>4) {
								med=4;
							}else if(leido.getNota1()*0.2+leido.getNota2()*0.35+leido.getNota3()*0.45>(int)(leido.getNota1()*0.2+leido.getNota2()*0.35+leido.getNota3()*0.45)+0.5) {
								med=(int)(leido.getNota1()*0.2+leido.getNota2()*0.35+leido.getNota3()*0.45)+1;
							}
							System.out.println(leido.toString()+"\nNota media: "+med);
							leido= (Notas) fs.readObject();
						}while(true);
					} catch (EOFException eof){
						System.out.println("Fin alumnos.");
					} catch (ClassNotFoundException e) {
						System.out.println("ERROR: Problema al leer objeto");
					} catch (FileNotFoundException e1) {
						System.out.println("ERROR: Archivo no encontrado");
					} catch (IOException e1) {
						System.out.println("ERROR: Problema en la lectura");
					}
				}else{
					System.out.println("No se han introducido alumnos");
				}
				break;
			case 6:
				c=0;
				break;
			case 5:
				try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
					
					Notas leido=new Notas();
					leido=(Notas) fs.readObject();
					do {
						System.out.println(leido.toString()+"\n");
						leido= (Notas) fs.readObject();
					}while(true);
				} catch (EOFException eof){
					System.out.println("Fin lectura.");
				} catch (ClassNotFoundException e) {
					System.out.println("ERROR: Problema al leer objeto");
				} catch (FileNotFoundException e1) {
					System.out.println("ERROR: Archivo no encontrado");
				} catch (IOException e1) {
					System.out.println("ERROR: Problema en la lectura");
					//e1.printStackTrace();
				}
				break;
			case 7:
				System.out.println(f.length());
try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream("borrar.dat"))){
					
					Notas leido=new Notas();
					leido=(Notas) fs.readObject();
					do {
						System.out.println(leido.toString()+"\n");
						leido= (Notas) fs.readObject();
					}while(true);
				} catch (EOFException eof){
					System.out.println("Fin lectura.");
				} catch (ClassNotFoundException e) {
					System.out.println("ERROR: Problema al leer objeto");
				} catch (FileNotFoundException e1) {
					System.out.println("ERROR: Archivo no encontrado");
				} catch (IOException e1) {
					System.out.println("ERROR: Problema en la lectura");
					//e1.printStackTrace();
				}
				break;
			default:
				System.out.println("No es una opcion");
			}
		}
		sc.close();
	}
}