package Ejercicios;

import java.util.*;
import java.io.*;

public class Ejercicio53 implements Serializable{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		/*Programa  Java  que  crea  un  archivo  binario  de  elementos  de  tipo  double  leídos  desde
		teclado.  A  continuación  escribe  un  método  para  rellenar  una  matriz  de  orden  MxN  usando
		los  datos  leidos  desde  el  archivo.  Si  hay  suficientes  datos  rellenamos  la  matriz,  en
		caso  de  no  haberlos;  los  datos  que  falten  se  ponen  a  0.  El  método  devuelve  un  valor
		indicativo  si  se  ha  podido  rellenar  la  matriz  con  datos  válidos  o  no  (puede  ser  de
		cualquier  tipo).Crear  un  programa  (método  main)  para  probarlo.*/
		Scanner sc=new Scanner(System.in);
		File f=new File("archivo.bin");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try (FileWriter fs = new FileWriter(f);){
			fs.write("Texto de prueba con FileWriter");
		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no encontrado");
		} catch (IOException e1) {
			System.out.println("Error de escritura");
		}
		sc.close();
		
	}

}
