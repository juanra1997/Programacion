package Practica_2_Utilizacion_de_objetos;
import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String cadena;
		int longitud,y, num, x=10;
		System.out.println("Introduce un numero");
		cadena=teclado.nextLine();
		longitud=cadena.length();
		y=longitud;
		System.out.println("El numero introducido tiene "+longitud+" digitos");
		teclado.close();
		num=Integer.parseInt(cadena);
		System.out.println("Digitos:");
		for(;y>=1;y--) {
			System.out.println(num%(x*(int)Math.pow(10, y-1))/(int)Math.pow(10, y-1));
		}
		
	}

}
