package Ficheros_de_objetos;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Ejercicio05 {

	
	public static void main(String[] args) {
		
		menu();
	}
	
	public static void menu() {
		File ar=new File("prueba");
		int op=0, f=0;;
		Scanner sc=new Scanner(System.in);
		while(f==0){
			System.out.println("Menu\n1. Crear  fichero  (debe  contener  libros  y  revistas)\n2. Añadir  publicaciones  (del  tipo  libros  y  revistas)\n3. Mostrar  datos.\n4. Salir  del  programa");
			op=sc.nextInt();
			switch(op) {
				case 1:
					if(!ar.exists()) {
						try {
							ar.createNewFile();
							System.out.println("****************************\nFichero creado\n****************************");
						} catch (IOException e) {
							System.out.println("Algo ha salido mal");
							//e.printStackTrace();
						}
					}else {
						System.out.println("****************************\nEsta opcion ya no es accesible\n****************************");
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					f=1;
					break;
				default:
						System.out.println("****************************\nNo es una opcion\n****************************");
			}
		}
		sc.close();
	}

}
