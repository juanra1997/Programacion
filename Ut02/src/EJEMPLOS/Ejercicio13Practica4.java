package EJEMPLOS;
import java.util.Scanner;
public class Ejercicio13Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int x;
		System.out.println("Introduce un numero");
		x=teclado.nextInt();
		if(x>=51&&x<=100) {
			System.out.println("Esta dentro del intervalo 51 - 100");
		}
		else {System.out.println("No esta dentro del intervalo 51 - 100");
		
		}
		teclado.close();
	}

}
