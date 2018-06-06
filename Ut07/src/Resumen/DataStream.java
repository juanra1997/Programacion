package Resumen;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	public static void main(String Arg[]) {
		//CREACION DEL FICHERO
		File fichero = new File("C:\\prueba\\DataStream.txt");
		try {
			if (!fichero.exists())
				fichero.createNewFile();
		} catch (IOException e) {
			System.out.println("Error al crear el fichero");
		}
		
		//ESCRITURA DEL FICHERO
		try(DataOutputStream fs = new DataOutputStream(new FileOutputStream(fichero))){
			fs.writeInt(18);
			fs.writeUTF("Angel");
			fs.writeDouble(54.8);
			
			fs.writeInt(14);
			fs.writeUTF("Miguel");
			fs.writeDouble(48.3);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("ERROR: Problema de escritura");
		}
		
		//LECTURA DEL FICHERO
		try(DataInputStream fs = new DataInputStream(new FileInputStream(fichero))){
			for(int i=1;i<=2;i++) {
				System.out.println("Edad: "+fs.readInt());
				System.out.println("Nombre: "+fs.readUTF());
				System.out.println("Peso: "+fs.readDouble());
				System.out.println("********************");
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("ERROR: Problema de escritura");
		}
	}
}
