package Practica_2_Utilizacion_de_objetos;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int horas;
		double salario, pago=0;
		System.out.println("Introduce el salario/h");
		salario=teclado.nextDouble();
		System.out.println("Introduce tus horas laborales");
		horas=teclado.nextInt();
		if (horas>37) {
			pago=pago+(37*salario);
			horas=horas-37;
			pago=pago+(horas*(salario+(salario/2)));
		}
		System.out.println("El sueldo de este es es de: "+pago+" €");
		teclado.close();
	}

}
