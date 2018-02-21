package EJEMPLOS;
import java.util.Scanner;
public class Divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num,den;
		System.out.println("Introduce el primer numero");
		num=teclado.nextInt();
		System.out.println("Introduce un numero distinto de 0");
		den=teclado.nextInt();
		if(den==0)System.out.println("Te dije que no introdujeras un puto 0 pedazo de trozo de mierda, aprende a leer GILIPOLLAS");
		else if(num%den==0)System.out.println(num+" es divisible entre "+den);
		else if(num%den!=0)System.out.println(num+" no es divisible entre "+den);
		teclado.close();
	}

}
