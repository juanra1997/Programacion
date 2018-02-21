package EJEMPLOS;
import java.util.Scanner;
public class Ejercicio9Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		final double iva=0.21;
		double x;
		System.out.println("Introduce el precio del procducto");
		x=teclado.nextInt();
		x=x*iva+x;
		System.out.println("El precio con iva del producto es: "+x);
		teclado.close();
	}

}
