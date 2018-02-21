package EJEMPLOS;
import java.util.Scanner;
public class Ejercicio7Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int nota=0, nota1, nota2, nota3;
		System.out.println("Introduce la primera nota");
		nota1=teclado.nextInt();
		nota=nota+nota1;
		System.out.println("Introduce la segunda nota");
		nota2=teclado.nextInt();
		nota=nota+nota2;
		System.out.println("Introduce la tercera nota");
		nota3=teclado.nextInt();
		nota=nota+nota3;
	System.out.println("La media es "+nota/3);
	teclado.close();
	}
}
