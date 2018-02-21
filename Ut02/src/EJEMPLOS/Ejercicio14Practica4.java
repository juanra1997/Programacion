package EJEMPLOS;
import java.util.Scanner;
public class Ejercicio14Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int x;
		System.out.println("Introduce un numero");
		x=teclado.nextInt();
		if(x>60&&x<90){
			System.out.println("Esta en el intervalo abierto de 60 - 90");
		}
		else {System.out.println("Error, o no esta en el intervalo abierto de 60 - 90 o es un numero positivo");
		}
		teclado.close();
	}

}
