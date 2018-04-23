package Ejercicios_usando_objetos_file;

import java.io.*;
import java.util.*;

public class ContenidoRecursivo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ruta;
		System.out.println("Introduce la ruta para mostrar sus archivos");
		ruta=sc.nextLine();
		File archivos=new File(ruta);
		archivos.list();
		for(int i=0; i<archivos.list().length; i++) {
			//System.out.print(archivos.list()[i]+" ");
			File aux=new File(ruta+"\\"+archivos.list()[i]);
			if(aux.isDirectory()) {
				//System.out.println();
				File aux1=new File(ruta+"\\"+archivos.list()[i]);
				for(int j=0; j<aux1.list().length; j++) {
					System.out.println(aux1.list()[j]);
				}
			} else {
				System.out.println(archivos.list()[i]+" es un fichero");
			}
		}
		sc.close();
	}
	
}
