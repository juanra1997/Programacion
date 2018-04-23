package Ejercicios_usando_objetos_file;

import java.util.*;
import java.io.*;

public class FiltroComienzo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ruta;
		char letra;
		System.out.println("Introduce la ruta para mostrar sus archivos");
		ruta=sc.nextLine();
		System.out.println("Introduce la letra por la que ha de comenzar");
		letra=sc.next().toUpperCase().charAt(0);
		File archivos=new File(ruta);
		archivos.list();
		for(int i=0; i<archivos.list().length; i++) {
			if(archivos.list()[i].toUpperCase().charAt(0)==letra) {
				System.out.println(archivos.list()[i]);
			}
		}
		sc.close();
	}

}
