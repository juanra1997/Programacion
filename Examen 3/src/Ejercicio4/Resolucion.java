package Ejercicio4;
import java.util.Scanner;
public class Resolucion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double A, B, C;
		System.out.println("Introduce el numero A de la ecuacion");
		A=sc.nextInt();
		System.out.println("Introduce el numero B de la ecuacion");
		C=sc.nextInt();
		System.out.println("Introduce el numero C de la ecuacion");
		B=sc.nextInt();
		sc.close();
		System.out.println("Solucion: "+Raices_Cuadradas_Grado_2.root(A,B,C));
	}
}
