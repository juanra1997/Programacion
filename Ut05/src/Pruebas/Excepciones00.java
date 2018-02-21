package Pruebas;
//import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.*;
public class Excepciones00 {
	
	public static void main(String[] args) {
		//@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s, t;
		System.out.println("Introduce un numero");
		s=sc.next();
		Excepciones00.validar(s);
		sc.close();
		t=JOptionPane.showInputDialog("Introduce un numero");
		Excepciones00.validarConCuadro(t);
		/*Crear un metodo que permita validar si el valor ingresado en un JOptionPane es numerico
		Crear un metodo que permita validar si el valor ingresado en un JOptionPane es de tipo caracteres
		Crear un metodo que permita validar si valor ingresado esta dentro del rango de 1 a 100*/
	}
	public static void validar(String s) {
		boolean validado=false;
		int i;
		while(validado==false){
			try {
				i=Integer.parseInt(s);
				System.out.println("Numero: "+i);
				validado=true;
			} catch(Exception e) {
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("No es un numero\nIntroduce un numero");
				s=sc.next();
			}
		}
	}
	
	public static void validarConCuadro(String s) {
		boolean validado=false;
		int i;
		while(validado==false){
			try {
				i=Integer.parseInt(s);
				System.out.println("Numero: "+i);
				validado=true;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null,"No es un numero");
				s=JOptionPane.showInputDialog("Introduce un numero");
			}
		}
	}
}