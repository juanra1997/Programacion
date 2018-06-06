package Ficheros_Binarios;

 import java.util.*;

import java.io.*;
 
public class PrincipalAlumnos implements Serializable{

	private static final long serialVersionUID = 1L;
	static File f=new File("Alumnos.bin");
	//static ArrayList<Alumno> arr=new ArrayList<Alumno>();

	public static void main(String[] args) {
		//System.out.println(arr.size());
		//System.out.println(f.exists());
		/*if(f.exists()) {
			f.delete();
		}*/
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("Algo ha salido mal");
			}
		}
		PrincipalAlumnos obj=new PrincipalAlumnos();
		obj.menu();
	}


	/*public static void introducirDatos(Alumno alumn) {
		
		try(ObjectOutputStream fs = new ObjectOutputStream(new FileOutputStream(f, true))){
			fs.writeObject(alumn);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("ERROR: Problema en la escritura");
		}
	}*/
	
	public static void leerDatos() {

		try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
			
			Alumno leido=new Alumno();
			leido=(Alumno) fs.readObject();
			do {
				System.out.println("***********************************");
				System.out.println(leido.toString());
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
		
	}

	public void menu() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int s=0;
		Scanner sc=new Scanner(System.in);
		int op=0;
		while(s==0) {
			System.out.println("Menú\n1. Escribir el archivo\n2. Leer el archivo\n3. Salir del programa");
			try {
				op=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("***********************************\nNo has introducido un numero\n***********************************");
				PrincipalAlumnos obj=new PrincipalAlumnos();
				obj.menu();
			}
			switch(op) {
			case 1:
				int i=0, cont=0, edad=0;
				String nom=null, dir=null;
				double nota;
				System.out.println("¿Cuantos alumnos quieres introducir?");
				try {
					i=sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("***********************************\nNo has introducido un numero\n***********************************");
					PrincipalAlumnos obj=new PrincipalAlumnos();
					obj.menu();
				}
				try(ObjectOutputStream fs = new ObjectOutputStream(new FileOutputStream(f))){
				while(cont<i) {
					if(i!=1) {
						System.out.println("Alumno "+(cont+1));
					}
					System.out.println("Introduce el nombre");
					try {
						nom=br.readLine();
					} catch (IOException e) {
						System.out.println("Algo ha salido mal");
					}
					//System.out.println(nom);
					System.out.println("Introduce la direccion");
					try {
						dir=br.readLine();
					}catch (IOException e) {
						System.out.println("Algo ha salido mal");
					}
					//System.out.println(dir);
					System.out.println("Introduce la edad");
					edad=sc.nextInt();
					//System.out.println(edad);
					System.out.println("Introduce la nota media");
					nota=sc.nextDouble();
					if(nota<0||nota>10) {
						nota=0;
					}
					//System.out.println(nota);
					cont++;
					fs.writeObject(new Alumno(nom, dir, edad, nota));;
				}
				} catch (FileNotFoundException e) {
					System.out.println("ERROR: Archivo no encontrado");
				} catch (IOException e) {
					System.out.println("ERROR: Problema en la escritura");
				}
				break;
			case 2:
				leerDatos();
				break;
			case 3:
				s=1;
				break;
			default:
				System.out.print("***********************************\nNo es una opción\n***********************************\n");
				break;
			}
		}
		sc.close();
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Algo ha salido mal");
		}
	}
}
