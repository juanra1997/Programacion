package EJEMPLOS;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int nota;
		System.out.println("Introduce la nota");
		nota=teclado.nextInt();
		if(nota>=5)System.out.print("El alumno esta aprobado");
		else System.out.print("El alumno esta suspenso");
		if(nota>10)System.out.print(" y, o te estas columpiando o te cae demasiado bien");
		if(nota<0)System.out.print(" y, o te escas columpiando o te cae demasiado mal");
		teclado.close();
	}

}
