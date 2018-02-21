package EJEMPLOS;
import java.util.Scanner;
public class Ejercicio12Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		char prueba;
		System.out.println("Introduce un caracter");
		prueba=teclado.next().charAt(0);
		if(Character.isDigit(prueba)) {
		System.out.println("Es un numero");
		}
		else {System.out.println("Es una letra");
		
		}
		teclado.close();
	}

}
