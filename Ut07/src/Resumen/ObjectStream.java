package Resumen;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {

	public static void main(String[] args) {
		//CREACION DE FICHERO
		File archivo =new File("C:\\prueba\\ObjectStream2");
		
		try(ObjectOutputStream fs = new ObjectOutputStream(new FileOutputStream(archivo))){
			Objeto obj1=new Objeto("Silla","Objeto para poder sentarse");
			Objeto obj3=new Objeto("Mesa","Objeto para colocar otros elementos");
			Objeto obj2=new Objeto("Coche","Objeto para poder desplazarse");
			fs.writeObject(obj1);
			fs.writeObject(obj2);
			fs.writeObject(obj3);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("ERROR: Problema en la escritura");
		}
		
		//LECTURA DE FICHERO		
		try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(archivo))){
			
			Objeto leido=new Objeto();
			leido=(Objeto) fs.readObject();
			do {
				System.out.println(leido.toString());
				leido= (Objeto) fs.readObject();
			}while(true);
		} catch (EOFException eof){
			System.out.println("Fin lectura.");
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR: Problema al leer objeto");
		} catch (FileNotFoundException e1) {
			System.out.println("ERROR: Archivo no encontrado");
		} catch (IOException e1) {
			System.out.println("ERROR: Problema en la lectura");
		}
	}
	

}
