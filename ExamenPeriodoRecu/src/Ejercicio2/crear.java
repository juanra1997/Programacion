package Ejercicio2;

import java.io.*;

public class crear {
	
	private static ObjectOutputStream fos;

	public static void main(String[] args) {

		File f=new File("C:\\Users\\Juanra\\Desktop\\ar2");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try{
			fos = new ObjectOutputStream(new FileOutputStream(f));
			Inversor obj1=new Inversor("23334373e","prueba1",2);
			Inversor obj3=new Inversor("23334374t","prueba2",1);
			Inversor obj2=new Inversor("23334376f","prueba4",0);
			fos.writeObject(obj1);
			fos.writeObject(obj2);
			fos.writeObject(obj3);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("ERROR: Problema en la escritura");
		} finally {
			try {
				fos.close();
			} catch (IOException e) {

			}
		}
	}

}
