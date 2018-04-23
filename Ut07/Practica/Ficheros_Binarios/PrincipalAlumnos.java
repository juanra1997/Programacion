package Ficheros_Binarios;

 import java.util.*;
 import java.io.*;
 
public class PrincipalAlumnos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			String ruta;
			int cont, resps;
			char resp='a';
			System.out.println("Introduce la ruta en la que leer el archivo");
			ruta=sc.nextLine();
			File archivo=new File(ruta+"\\Alumnos");
			if(!archivo.exists()) {
				while(resp!='S'&&resp!='N') {
					System.out.println("El archivo no existe ¿Quieres crearlo? (S/N)");
					resp=sc.next().toUpperCase().charAt(0);
				}
				if(resp=='N') {
					System.out.println("Fin");
				}else if(resp=='S') {
					archivo.createNewFile();	
				}
			}
			if(archivo.exists()) {
				FileOutputStream fos=new FileOutputStream(archivo, true);
				ObjectOutputStream dos=new ObjectOutputStream(fos);
				FileInputStream fis=new FileInputStream(archivo);
				//DataInputStream dis=new DataInputStream(fis);
				ObjectInputStream dis=new ObjectInputStream(fis);
				System.out.println("¿Que quieres hacer?\n1. Escribir en el archivo\n2. Leer el archivo\nLos demas numeros salen del programa");
				resps=sc.nextInt();
				while(resps==2||resps==1) {
					switch(resps){
						case 1:
							System.out.println("¿Cuantos alumnos quieres escribir?");
							cont=sc.nextInt();
							for(int i=0; i<cont; i++) {
								System.out.println("Alumno "+(i+1));
								IntroducirDatos(dos);
							}
						break;
						case 2:
							//BufferedReader br=new BufferedReader(new FileReader(archivo));
							LeerDatos(dis);
						break;
							}
					System.out.println("¿Que quieres hacer?\n1. Escribir en el archivo\n2. Leer el archivo\nLos demas numeros salen del programa");
					resps=sc.nextInt();
				}
				fis.close();
				sc.close();
			}
		} catch (IOException e) {
			System.out.println("Algo ha salido mal :(");
			e.printStackTrace();
		}
	}
	public static void IntroducirDatos(ObjectOutputStream archivo) {
		/*String nombre, direccion;
		int edad;
		double nota;*/
		Scanner sc;
		sc=new Scanner(System.in);
		/*System.out.println("Introduce el nombre del alumno");
		nombre=sc.nextLine();
		System.out.println("Introduce la dirección del alumno");
		direccion=sc.nextLine();
		System.out.println("Introduce la edad del alumno");
		edad=sc.nextInt();
		System.out.println("Introduce la nota media del alumno");
		nota=sc.nextDouble();*/
		try {
			System.out.println("Introduce el nombre del alumno");
			archivo.writeObject(sc.nextLine());
			System.out.println("Introduce la dirección del alumno");
			archivo.writeObject(sc.nextLine());
			System.out.println("Introduce la edad del alumno");
			archivo.writeObject(sc.nextInt());
			System.out.println("Introduce la nota media del alumno");
			archivo.writeObject(sc.nextDouble());
		} catch (IOException e) {
			System.out.println("Algo ha salido mal :(");
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static void LeerDatos(ObjectInputStream archivo) {
		try {
			/*System.out.println(archivo.readUTF());
			System.out.println(archivo.readUTF());
			System.out.println(archivo.readInt());
			System.out.println(archivo.readDouble());*/
			Object lec;
			lec=archivo.read();
			String l=lec.toString();
			for(int i=0; i<l.length(); i++) {
				System.out.print(lec);
				lec=archivo.read();
			}
		} catch (IOException e) {
			System.out.println("Algo ha salido mal :(");
			//e.printStackTrace();
		}
		
	}
}
