package Practica_2_Utilizacion_de_objetos;
import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		// TODO Auto-generated method stub
		double a,b,c;
		System.out.println("Introduce a para resolver: ax2+bx+c=0, teniendo en cuenta que el valor que buscas es x");
		a=teclado.nextDouble();
		System.out.println("Introduce b para resolver: ax2+bx+c=0, teniendo en cuenta que el valor que buscas es x");
		b=teclado.nextDouble();
		System.out.println("Introduce c para resolver: ax2+bx+c=0, teniendo en cuenta que el valor que buscas es x");
		c=teclado.nextDouble();
		System.out.println("Los valores de x son:");
		System.out.println("x="+(((-1)*b)+Math.pow(Math.pow(b, 2)-4*a*c, 0.5))/(2*a));
		System.out.println("x="+(((-1)*b)-Math.pow(Math.pow(b, 2)-4*a*c, 0.5))/(2*a));
		teclado.close();
	}

}
