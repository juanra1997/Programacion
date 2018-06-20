package Ejercicio2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;




public class leer {

	private static ObjectInputStream fs;
	
	public static void main(String[] args) {
		File f=new File("fusionado.dat");
		try {
			fs = new ObjectInputStream(new FileInputStream(f));
				
				Inversor leido=new Inversor();
				leido=(Inversor) fs.readObject();
				do {
					System.out.println(leido.toString());
					leido= (Inversor) fs.readObject();
				}while(true);
			} catch (EOFException eof){
				System.out.println("Fin lectura.");
			} catch (ClassNotFoundException e) {
				System.out.println("ERROR: Problema al leer objeto");
			} catch (FileNotFoundException e1) {
				System.out.println("ERROR: Archivo no encontrado");
			} catch (IOException e1) {
				System.out.println("ERROR: Problema en la lectura");
			} finally {
				try {
					fs.close();
				} catch (IOException e) {

				}
			}

	}

}
