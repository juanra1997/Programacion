package Resumen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
	public static void main(String arg[]) {
		//ESTABLECER UN FICHERO
		File archivo = new File("C:\\prueba\\FileStream.txt"); 
		try {
			archivo.createNewFile();
		} catch (IOException e1) {
			System.out.println("Error en la creacion del archivo");
		}
		
		//ESCRITURA EN BINARIO
		try(FileOutputStream fs = new FileOutputStream(archivo)) {
			fs.write(5);
			fs.write(21);
		} catch (FileNotFoundException  e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e1) {
			System.out.println("Error de escritura");
		}
		
		//LECTURA EN BINARIO
		try(FileInputStream fe = new FileInputStream(archivo)) {
			int lector;
			do {
				lector=fe.read();
				if (lector != -1)
					System.out.println(lector);
			}while(lector != -1);
		} catch (FileNotFoundException  e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e1) {
			System.out.println("Error de escritura");
		}
	}
}
