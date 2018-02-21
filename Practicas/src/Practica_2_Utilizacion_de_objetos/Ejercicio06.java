package Practica_2_Utilizacion_de_objetos;
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num, n=1;
		System.out.println("Introduce un numero positivo");
		num=teclado.nextInt();
		while(num>0) {
			while(n<=num) {
				System.out.print(n+" ");
				n++;
			}
			System.out.print("\n");
			n=1;
			num--;
			teclado.close();
		}
	}

}
