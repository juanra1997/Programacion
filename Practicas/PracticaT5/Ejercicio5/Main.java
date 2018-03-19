package Ejercicio5;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double aux;
		Silo prueba=new Silo(200, 20);
		try {
			System.out.println("Llena el silo");
			aux=sc.nextDouble();
			prueba.llenaSilo(aux);
			System.out.println(prueba.estadoSilo());
		} catch(Exception e) {
			System.out.println("No valido");
		}
		try {
			System.out.println("Vacia el silo");
			aux=sc.nextDouble();
			prueba.vaciaSilo(aux);
			System.out.println(prueba.estadoSilo());
		} catch(Exception e) {
			System.out.println("No valido");
		}
		sc.close();
	}
}
