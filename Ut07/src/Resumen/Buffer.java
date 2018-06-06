package Resumen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer {

	public static void main(String[] args) {
		//BUFFER ESCRITURA
		FileWriter fs = null;
		try {
			fs = new FileWriter("C:\\prueba\\Buffer.txt");
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try (BufferedWriter bs = new BufferedWriter(fs);){
			bs.write("Texto de prueba con Buffer de escritura");
		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no encontrado");
		} catch (IOException e1) {
			System.out.println("Error de escritura");
		}
		
		//BUFFER LECTURA
		FileReader fe = null;
		try {
			fe = new FileReader("C:\\prueba\\Buffer.txt");
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try (BufferedReader bs = new BufferedReader(fe);){
			String lector=bs.readLine();
			while (lector != null) {
				System.out.println(lector);
				lector=bs.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no encontrado");
		} catch (IOException e1) {
			System.out.println("Error en la lectura");
		}
	}
}
