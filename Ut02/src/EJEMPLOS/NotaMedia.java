package EJEMPLOS;
import java.util.Scanner;
public class NotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int cont=0;
		int n;
		double nota;
		double suma=0;
		System.out.println("Introduce el numero total de alumnos");
		n=teclado.nextInt();
		while(cont<n)
		{
		System.out.println("Introuce nota del alumno");
		nota=teclado.nextDouble();
		if(nota>=0&&nota<=10) {
			suma=suma+nota;
			cont++;
		}
		else {System.out.println("Error, nota introducida no valida, introduce una nota valida");
		}
	}
	System.out.println("La media es "+suma/(double)n);
	teclado.close();
}
}
