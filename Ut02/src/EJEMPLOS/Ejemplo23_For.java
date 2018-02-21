package EJEMPLOS;
import java.util.Scanner;
public class Ejemplo23_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		final int fin=0;
		double num;
		System.out.println("Introduce numeros, introduce un 0 cuando quieras parar");
		num=teclado.nextDouble();
		for(;num!=fin;) {
			System.out.println("Introduce otro numero, 0 si quieres parar");
			num=teclado.nextDouble();
		}
		System.out.println("Fin");
		teclado.close();
	}

}
