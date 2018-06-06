package Resumen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Print_Stream {

	public static void main(String[] args) {
		//CREACION DEL FICHERO
		File fichero = new File("C:\\prueba\\PrintStream.txt");
		try {
			if (!fichero.exists())
				fichero.createNewFile();
		} catch (IOException e) {
			System.out.println("Error al crear el fichero");
		}
		
		//ESCRITURA DEL FICHERO
		try(PrintStream fs = new PrintStream(new FileOutputStream(fichero))){
			fs.print("Esto es una prueba de escritura.");
			fs.println(" Seguimos escribiendo en la misma linea.");
			fs.println("Escribimos en una nueva linea.");
		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no encontrado");
		}
		
	}

}
