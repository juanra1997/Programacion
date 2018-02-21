package Ejercicios;
import java.util.Scanner;
public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String texto;
		int a=0, e=0, i=0, o=0, u=0;
		System.out.println("Escribe un texto");
		texto=sc.nextLine();
		for(int x=0; x<texto.length(); x++) {
			if(texto.charAt(x)=='a') {
				a++;
			}
			if(texto.charAt(x)=='e') {
				e++;
			}
			if(texto.charAt(x)=='i') {
				i++;
			}
			if(texto.charAt(x)=='o') {
				o++;
			}
			if(texto.charAt(x)=='u') {
				u++;
			}	
		}
		System.out.print("a: "+a+" -> ");
		for(int x=0; x<a; x++) {
			System.out.print("*");
		}
		System.out.print("\ne: "+e+" -> ");
		for(int x=0; x<e; x++) {
			System.out.print("*");
		}
		System.out.print("\ni: "+i+" -> ");
		for(int x=0; x<i; x++) {
			System.out.print("*");
		}
		System.out.print("\no: "+o+" -> ");
		for(int x=0; x<o; x++) {
			System.out.print("*");
		}
		System.out.print("\nu: "+u+" -> ");
		for(int x=0; x<u; x++) {
			System.out.print("*");
		}
		sc.close();
	}
}
